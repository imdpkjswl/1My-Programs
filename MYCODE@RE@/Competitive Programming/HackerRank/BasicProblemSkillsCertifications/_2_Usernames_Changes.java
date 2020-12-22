import java.util.ArrayList;
import java.util.List;

class _2_Usernames_Changes {

	public static List<String> possibleChanges(List<String> usernames) {
		List<String> ans = new ArrayList<>();
		for (int u = 0; u < usernames.size(); u++) {
			String str = usernames.get(u);
			char[] chr = str.toCharArray();

			boolean flag = false;
			out:
			for (int i = str.length() - 1; i >= 0; i--) {
				for (int j = i - 1; j >= 0; j--) {
					if (chr[j] > chr[i]) {
						ans.add("YES");
						flag = true;
						break out;
					}
				}
			}
			if (!flag) {
				ans.add("NO");
			} else {
				flag = false;
			}
		}

		return ans;
	}



	public static void main(String[] args) {

		List<String> username = new ArrayList<>();
		username.add("hydra");
		username.add("foo");
		username.add("bar");
		username.add("baz");
		List<String> result = possibleChanges(username);
		System.out.println(result.toString());
	}
}