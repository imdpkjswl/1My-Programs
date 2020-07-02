package com.iamdj;

// Solving using nested Loop:  O(n^2)
public class Main {

    public static void main(String[] args) {

        String[] str = {"hate", "love","twice", "peace", "love",
                "peace", "hate", "love", "peace","twice",
                "love", "peace"};

        int count = 0;
        int flag = 0;
        for(int i=0; i<str.length; i++) {
            for(int j=0; j<str.length; j++) {

                if(str[i].equals(str[j])  && !str[i].equals("ignore")){
                    flag++;
                }
            }

            if(flag == 2){
                System.out.print(str[i] +" ");
                str[i] = "ignore";  // assign to ignore the counted word.
                count++;
            }
            flag =0;
        }

        System.out.println("\nThe total words that appears exactly twice:  "+count);
    }
}



