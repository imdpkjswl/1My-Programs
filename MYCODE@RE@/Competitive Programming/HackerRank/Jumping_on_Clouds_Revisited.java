import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Jumping_on_Clouds_Revisited {

	// Complete the jumpingOnClouds function below.
	static int jumpingOnClouds(int[] c, int k) {
		int n = c.length;
		int energy = 100;
		int cloud = 0;

		do {
			energy--; //You performed a jump

			cloud = (cloud + k) % n; // as given

			if (c[cloud] == 1) {
				energy -= 2;//You landed on a thundercloud
			}
		} while (cloud != 0);

		return energy;
	}


	public static void main(String[] args) throws IOException {

		int[] c = new int[] { 1, 1, 1, 0, 1, 1, 0, 0, 0, 0};
		int k = 3;

		int result = jumpingOnClouds(c, k);
		System.out.println(result);
	}
}
