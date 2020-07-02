package com.iamdj;

/**
 * My method:
 * Time complexity: O(n)
 * Auxiliary Space: O(n)
 */
public class Main {

    static void smallLargeWord(char[] chr){

        int[] temp = new int[chr.length/2];  // array contain starting index of every word except first word.
        int k=0;
        int begin=0;
        int end = 0;
        int diff;
        for(int i=0;i<chr.length;i++){
            end++;
            if(chr[i] == ' ' ){ // every word is separated by space except last word.
                diff = end - begin; // take difference of word
                temp[k++] = diff;
            }

            if( i == chr.length-1) {  // handling last word coz it not terminated by space.
                diff = end - begin;
                diff = diff+1;  // adding 1 to neglect space.
                temp[k++] = diff;
            }
        }

        // FINDING SMALLEST WORD
        int small=Integer.MAX_VALUE;   // for finding smallest difference for smallest word in string.
        small = temp[0] - begin;// taking difference of first word
        end = small;
        for(int i=1;i<k;i++){
            if(temp[i] - temp[i-1] <= small ){
                small = temp[i] - temp[i-1];
                
                begin = temp[i-1];
                end = temp[i];
            }
        }
        System.out.print("Smallest word:  ");
        for(int i=begin;i<end-1;i++)
            System.out.print(chr[i]);
        System.out.println();



        // FINDING LARGEST WORD
        int large=Integer.MIN_VALUE;   // for finding largest difference for largest word in string.
        int start=0;
        int finish=0;
        large = temp[0]-start; // taking difference of first word
        finish = large;
        for(int i=1;i<k;i++){
            if(temp[i] - temp[i-1] > large ){
                large = temp[i] - temp[i-1];

                start = temp[i-1];
                finish = temp[i];

            }
        }

        System.out.print("Largest word:  ");
        for(int i=start;i<finish-1;i++)
            System.out.print(chr[i]);


    }
    public static void main(String[] args) {

        String str = "GeeksForGeeks has computer Science portal Geeks";
        char[] chr = str.toCharArray();
        System.out.println("Given string: "+str);
        smallLargeWord(chr);



    }
}
