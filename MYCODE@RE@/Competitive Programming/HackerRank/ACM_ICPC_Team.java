import java.util.*;

// MY SOLUTION
public class ACM_ICPC_Team {
	public static int countTopic(boolean[] flag) {
		int noOfTopic = 0;
		for (int i = 0; i < flag.length; i++)
			if (flag[i])
				noOfTopic++;

		return noOfTopic;
	}


	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {

		int n, m;
		n = in.nextInt();
		m = in.nextInt();

		ArrayList []a = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			a[i] = new ArrayList();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i].add(in.nextInt());
			}
		}

		// for (int i = 0; i < n; i++) {
		// 	for (int j = 0; j < m; j++) {
		// 		System.out.print(a[i].get(j) + " ");
		// 	}
		// 	System.out.println();
		// }

		boolean []flag = new boolean[m];
		Integer ONE = 1;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (a[i - 1].get(j) == ONE || a[i].get(j) == ONE ) {
					flag[j] = true;
				}
			}
		}

		int noOfTopic = countTopic(flag);
		System.out.println(noOfTopic);

		Arrays.fill(flag, false);
		ArrayList<Integer> maxTwoPersonTeam = new ArrayList<>();
		for (int i = 0; i < n - 1; i++) {
			for (int k = i + 1; k < n; k++) {
				for (int j = 0; j < m; j++) {
					if (a[i].get(j) == ONE || a[k].get(j) == ONE ) {
						flag[j] = true;
					}
				}
				maxTwoPersonTeam.add(countTopic(flag));
				Arrays.fill(flag, false);
			}

		}

		Integer max = 0;
		for (Integer i : maxTwoPersonTeam)
			if (i > max)
				max = i;

		//System.out.println(max);
		Integer fmax = 0;
		for (Integer i : maxTwoPersonTeam)
			if (i == max)
				fmax++;

		System.out.println(fmax);

	}
}

// The difference between my solution and real, i'm considering input as integer value
// but real one considered as string value.



/*
// REAL SOLUTION
import java.io.*;
import java.util.*;
import java.lang.Math;

public class ACM_ICPC_Team {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
/*
Scanner input = new Scanner(System.in);
int n = input.nextInt();
int m = input.nextInt();

String[] skills = new String[n];
int maxSkills = 0;
int maxSkillTeams = 0;
input.nextLine(); //advances the past the first line of input integers

for (int i = 0; i < n; i++) {
	skills[i] = input.nextLine();
}


for (int i = 0; i < n; i++) {
	for (int j = i + 1; j < n; j++) {
		String member1 = skills[i];
		String member2 = skills[j];
		int skillSet = 0;

		for (int k = 0; k < m; k++) {
			if (member1.charAt(k) == '1' || member2.charAt(k) == '1') {
				skillSet++;
			}
		}

		maxSkillTeams += (maxSkills == skillSet) ? 1 : 0;

		if (skillSet > maxSkills) {
			maxSkillTeams = 1;
			maxSkills = skillSet;
		}
	}
}
System.out.println(maxSkills + "\n" + maxSkillTeams);
}
}
*/