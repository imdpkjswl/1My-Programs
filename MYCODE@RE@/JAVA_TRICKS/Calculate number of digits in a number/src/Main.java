/******************************************************************************
 Program to calculate number of digits in a number
 *******************************************************************************/
import java.math.*;

public class Main {
    public static void main(String[] args) {

        int num = 1234567890;
        System.out.println("No. of digits of "+num+" is: ");

        int digits = (int)Math.floor(Math.log10(num))+1;

        System.out.println(digits);
    }
}

