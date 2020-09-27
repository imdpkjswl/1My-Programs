import java.util.*;

/*
A string is called diverse if it contains consecutive (adjacent) letters of the Latin alphabet and each letter occurs exactly once. For example, the following strings are diverse: "fced", "xyz", "r" and "dabcef". The following string are not diverse: "az", "aa", "bad" and "babc". Note that the letters 'a' and 'z' are not adjacent.
Formally, consider positions of all letters in the string in the alphabet. These positions should form contiguous segment, i.e. they should come one by one without any gaps. And all letters in the string should be distinct (duplicates are not allowed).
You are given a sequence of strings. For each string, if it is diverse, print "Yes". Otherwise, print "No".

input:
8
fced
xyz
r
dabcef
az
aa
bad
babc

output:
Yes
Yes
Yes
Yes
No
No
No
No
*/


public class A_Diverse_Strings {
	private static String diverse(char[] chr){
		Arrays.sort(chr);
		int begin = (int)chr[0];
		int end  = (int)chr[chr.length-1];
		// System.out.println(begin+"  "+end);

		int[] table = new int[123];
		Arrays.fill(table, -1);
		
		for(int i=0;i<chr.length;i++){
			table[(int)chr[i]]++;	
		}

		for(int i=begin;i<=end;i++){
			// System.out.print(table[i]+" ");
			if(table[i] != 0){
				return "No";
			}
		}

		return "Yes";
	}

	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = in.nextInt();

		for(int i=0;i<n;i++){

			String str = in.next();
			char[] chr = str.toCharArray();

			String res = diverse(chr);
			System.out.println(res);
		}
	}
}