package wipro;

import java.util.*;
/*
class deepak {

    static void swap(int[] ar, int i, int j){
        int tmp = ar[i];
        ar[i] = ar[j];
        ar[j] = tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = 39631;

        ArrayList<Integer> arr = new ArrayList<>();
        while(n!=0){
            arr.add((int)n%10);
            n /= 10;
        }

        int[] ans = new int[arr.size()];
        int j=0;
        for(int i=0;i<arr.size();i++){
            ans[j++] = arr.get(arr.size()-1-i);
        }



        for(int i=0;i<ans.length-1;){
            swap(ans,i++,i++);
        }

        for(int val: ans){
            System.out.print(val+" ");
        }
    }
   }
 */

/*
Example:-
Input:
39631
Output:
93361

step1: Inter change 1st and 2nd position, i.e. 93631
step2: Again inter change 3rd and 4th position, i.e. 93361 and repeat this till end
 hence: 93361 is the right answer.
 */



class deepak {
    static int countUniqueWords(String str ){
        int ans = 0; // count unique words

        int count=0;
        String[] words = str.split("\\W"); // str.split("\\s+");

        for(int i=0;i<words.length;i++){
            count=1;

            for(int j=i+1;j<words.length;j++){
                if(words[i].equals(words[j])){
                    count++;
                    words[j] = " "; // assign space
                }
            }

            if(count == 1 && words[i] != " "){
                System.out.println(words[i]);
                ans++;
            }
        }

        return ans;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = "I love to swim and I like to travel abroad";
        //String[] s = str.split("\\s+"); // split string with spaces

        System.out.println(countUniqueWords(str));

    }

    /*
Example-
Input: str = "I love to swim and I like to travel abroad"
Output: 6 // unique words
     */
}