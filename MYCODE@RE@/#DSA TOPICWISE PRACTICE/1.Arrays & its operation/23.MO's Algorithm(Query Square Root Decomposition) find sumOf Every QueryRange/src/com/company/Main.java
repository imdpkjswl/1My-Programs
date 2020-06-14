package com.company;

import java.util.*;


/** Naive Approach:
 * Time Complexity: O(n*m)
 * Auxiliary Space: O(1)
 */
/*
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        System.out.println("Enter the size of query:");
        int m = sc.nextInt();
        int[] query = new int[2*m];
        System.out.println("Enter the query:");
        for(int i=0;i<2*m;i++) query[i] = sc.nextInt();


        int j=0;
        int sum=0;
        for(int k=0;k<m;k++){
            sum =0;
            for(int i=query[j++];i<=query[j];i++) {
                sum += arr[i];
            }
            j++;  // for next iteration.
            System.out.println("The sum of range("+query[j-2]+","+query[j-1]+") is:  "+sum);
        }


    }
}
*/




// Java Program to compute sum of ranges for different range queries

/**
 * Time COmplexity: O((m+n) * √n)
 */
// Class to represent a query range
class Query {
    int L;
    int R;
    Query(int L, int R){
        this.L = L;
        this.R = R;
    }
}

// MO's Algo Implementation: NEED TO TRY AGAIN.
class Main{

    // Prints sum of all query ranges. m is number of queries
    // n is size of array a[].

    static void queryResults(int a[], int n, ArrayList<Query> q, int m){

        // Find block size
        int block = (int) Math.sqrt(n);

        // Sort all queries so that queries of same blocks are arranged together.
        Collections.sort(q, new Comparator<Query>(){

            // Function used to sort all queries so that all queries of the same block are arranged together and within a block,
            // queries are sorted in increasing order of R values.
            public int compare(Query x, Query y){

                // Different blocks, sort by block.
                if (x.L/block != y.L/block)
                    return (x.L < y.L ? -1 : 1);

                // Same block, sort by R value
                return (x.R < y.R ? -1 : 1);
            }
        });

        // Initialize current L, current R and current sum
        int currL = 0, currR = 0;
        int currSum = 0;

        // Traverse through all queries
        for (int i=0; i<m; i++)
        {
            // L and R values of current range
            int L = q.get(i).L, R = q.get(i).R;

            // Remove extra elements of previous range. For
            // example if previous range is [0, 3] and current
            // range is [2, 5], then a[0] and a[1] are subtracted
            while (currL < L)
            {
                currSum -= a[currL];
                currL++;
            }

            // Add Elements of current Range
            while (currL > L)
            {
                currSum += a[currL-1];
                currL--;
            }
            while (currR <= R)
            {
                currSum += a[currR];
                currR++;
            }

            // Remove elements of previous range.  For example
            // when previous range is [0, 10] and current range
            // is [3, 8], then a[9] and a[10] are subtracted
            while (currR > R+1)
            {
                currSum -= a[currR-1];
                currR--;
            }

            // Print sum of current range
            System.out.println("Sum of [" + L +
                    ", " + R + "] is "  + currSum);
        }
    }

    // Driver program
    public static void main(String argv[]){
        ArrayList<Query> q = new ArrayList<Query>();
        q.add(new Query(0,4));
        q.add(new Query(1,3));
        q.add(new Query(2,4));

        int a[] = {1, 1, 2, 1, 3, 4, 5, 2, 8};
        queryResults(a, a.length, q, q.size());
    }
}