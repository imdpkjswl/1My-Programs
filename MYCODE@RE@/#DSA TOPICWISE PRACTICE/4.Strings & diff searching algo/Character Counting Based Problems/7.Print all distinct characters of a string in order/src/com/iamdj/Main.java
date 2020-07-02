package com.iamdj;

// Solving using Nested Loop: O(n^2)
public class Main {

    public static void main(String[] args) {

        String str = "Hello To You All";
        char[] chr = str.toCharArray();
        int n = chr.length;


        boolean flag = true;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++){
                if(chr[i] != '!'){
                    if(chr[i] == chr[j]){
                        chr[j] = '!'; // Assign all any other character for further neglecting purpose.
                        flag = false;
                    }
                }
            }
            if(!flag){
                chr[i] = '!'; // mean ith is not distinct
            }
            flag = true;
        }

        // Print distinct characters
        for(int k=0;k<chr.length;k++){
            if(chr[k] != '!' && chr[k] != ' ') {
                System.out.print(chr[k]);
            }
        }


    }
}




