import java.util.Arrays;
import java.util.Scanner;


/**
 * Time Complexity: O(n^2)
 * Auxiliary Space: O(frameSize)
 */
public class Main {
    static Scanner in = new Scanner(System.in);

    static int frameSize;
    static int[] frame;
    static int n;
    static int[] arr;


         static void basicRequirement(){
            System.out.println("Enter the size of frame:");
            frameSize = in.nextInt();
            frame = new int[frameSize];
            System.out.println("Enter the size of array:");
            n = in.nextInt();
            arr = new int[n];  // initialise array
            System.out.println("Enter array element(page):");
            for(int i=0;i<n;i++){
                arr[i] = in.nextInt();
            }
        }


    // first insert nf element into the frame.
    static void initialise(){

        if(frameSize >= n || frameSize <= 0 )  {
            System.out.println("LRU cache can't applied.");
            System.exit(1);
        }


        // May Use Inbuilt Method:  System.arraycopy(arr, 0, frame, 0, frameSize);

        // Manually copying arrays.
        for(int i=0;i<frameSize;i++) {
            frame[i] = arr[i];
        }
    }


    /**
     *  print index of hits of array & no. of hits.
     */
    static void pageReplacementAlgorithm() {

        int hit = 0;
        for(int i=frameSize;i<n;i++) {
            int temp  = arr[i];

            //System.out.println(Arrays.toString(frame));
            int index = search(temp); // check for page HIT.

            if(index == -1) {  // When Page fault occur, then we apply LRU Cache.
                int replaceIndex = leastRecentUsedPage(i);  // find index to replace with current page.

                if(replaceIndex != -1){
                    frame[replaceIndex] = temp; // replace page
                }
            }
            else {
                hit++;
                if(hit == 1){  // only one time execute
                    System.out.println("The index of page hits are: ");
                }
                System.out.print(i + " ");  // print index of page hit.
            }
        }

        System.out.println("\n\nTotal page hits:  "+hit);
    }


    /**
     * @param endIndex
     * @return least recent used page index in frame.
     */
    static int leastRecentUsedPage(int endIndex){

        boolean[] visited = new boolean[frameSize];
        Arrays.fill(visited,false);

        int count =0; // used to find least used page.
        for(int i= endIndex; i>=0; i--){ // check from current index  to index 0.
            int index = search(arr[i]);
            if(index != -1){

                if(!visited[index])
                    count++;  // increment only when we had not visited already.
                visited[index] = true;

                if(count == frameSize){ // got least recent used page.
                    return index;
                }
            }
        }

        return -1;
    }


    /**
     * @param item
     * @return index of frame.
     */
    static int search(int item) {
        for(int i=0;i<frameSize;i++) {
            if(frame[i] == item){
                return i;  // found at index 'i'.
            }
        }
        return -1;  // not found
    }



    public static void main(String[] args) {

        basicRequirement(); // get necessary requirement.

        initialise();  // store first nf element into frame array.

        pageReplacementAlgorithm();  // Apply LRU Page Replacement Algorithm.

    }

}


/*
Input:
Enter the size of frame:
4
Enter the size of array:
20
Enter array element(page):
7 0 1 2 0 3 0 4 2 3 0 3 2 1 2 0 1 7 0 1

Output:
The index of page hits are:
4 6 8 9 10 11 12 14 15 16 18 19

Total page hits:  12

 */