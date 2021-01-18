import java.util.ArrayList;
import java.util.List;


class _1431_Kids_With_the_Greatest_Number_of_Candies {
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> ans = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		for (int val : candies) {
			max = Math.max(max, val);
		}

		for (int i = 0; i < candies.length; i++) {
			if ((candies[i] + extraCandies) >= max) {
				ans.add(true);
			} else {
				ans.add(false);
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] arr = {2, 3, 5, 1, 3};
		int extra = 3;
		for (boolean i : kidsWithCandies(arr, extra)) {
			System.out.print(i + "  ");
		}
	}
}