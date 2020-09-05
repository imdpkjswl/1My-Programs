import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Cats_and_Mouse {

	// Complete the catAndMouse function below.
	static String catAndMouse(int x, int y, int z) {
		int diffzx = Math.abs(z - x);
		int diffzy = Math.abs(z - y);

		if (diffzx > diffzy)
			return "Cat B";
		else if (diffzx < diffzy)
			return "Cat A";
		else
			return "Mouse C";

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		//int query = 2;

		int x = 2; // Cat A
		int y = 12; // Cat B
		int z = 6; // Mouse C

		String result = catAndMouse(x, y, z);
		System.out.println(result);
	}
}
