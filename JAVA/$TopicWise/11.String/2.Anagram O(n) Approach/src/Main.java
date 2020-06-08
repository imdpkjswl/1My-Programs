
// This program works for all type of symbols present in ascii table.
public class Main {
    public static void main(String[] args){

        String a = "act";
        String b = "match";
        boolean isAnagram = true;
        int[] al = new int[256];
        int[] bl = new int[256];

        // Insert frequency of characters of string 'a' at index of al
        for(char c: a.toCharArray()){
            int index = (int)c;
            al[index]++;
        }

        // Insert frequency of characters of string 'b' at index of bl
        for(char c: b.toCharArray()){
                int index = (int)c;
                bl[index]++;
        }

        // compare the both array having same elements present or not
        for(int i=0;i<256;i++){
            if(al[i] != bl[i]){
                isAnagram = false;
                break;
            }
        }

        if(isAnagram)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");

    }
}
