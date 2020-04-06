import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str1, str2,concat;
        System.out.println("Enter first string:");
        str1=in.nextLine();
        System.out.println("Enter second string:");
        str2 = in.nextLine();

        concat = str1+str2;
        System.out.println("Concatenated string:  "+concat);
        int str1Len = str1.length();
        System.out.println("Length of first string:  "+str1Len);
        int str2Len = str2.length();
        System.out.println("Length of second string:  "+str2Len);

        str1 = str1.toUpperCase();
        System.out.println("UpperCase of first string:  "+str1);
        str2 = str2.toUpperCase();
        System.out.println("UpperCase of second string:  "+str2);

        str1 = str1.toLowerCase();
        System.out.println("LowerCase of first string:  "+str1);
        str2 = str2.toLowerCase();
        System.out.println("LowerCase of second string:  "+str2);

    }
}
