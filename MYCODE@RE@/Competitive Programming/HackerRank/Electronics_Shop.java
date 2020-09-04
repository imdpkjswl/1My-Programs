import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Electronics_Shop {

	/*
	 * Complete the getMoneySpent function below.
	 */
	static int getMoneySpent(int amount, int[] keyboard, int[] usb) {
		int sum = 0, maxSum = Integer.MIN_VALUE;

		// Brute force approach
		for (int i = 0; i < keyboard.length; i++) {
			for (int j = 0; j < usb.length; j++) {
				sum = keyboard[i] + usb[j];
				if (sum <= amount) {
					if (sum > maxSum) {
						maxSum = sum;
					}
				}

			}
		}

		/*
		for(int i:keyboard){
			for(int j:usb){
				sum = i + j;
				if(sum <= amount){
					maxSum = Math.max(sum, maxSum);
				}
			}
		}
		*/
		if (maxSum == Integer.MIN_VALUE)
			return -1;
		return maxSum;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int amount, noOfKeyboard, noOfUsb;

		amount = 10;
		noOfKeyboard = 2;
		noOfUsb = 3;


		int[] keyboard = new int[] {3, 1};
		int[] usb = new int[] {5, 2, 8};
		/*
		 * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
		 */
		// for (int i = 0; i < noOfKeyboard; i++)
		// 	keyboard[i] = scanner.nextInt();

		// for (int i = 0; i < noOfUsb; i++)
		// 	usb[i] = scanner.nextInt();

		int moneySpent = getMoneySpent(amount, keyboard, usb);
		System.out.println(moneySpent);

	}
}
