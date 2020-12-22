import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class _1_Unexpected_Demand {

	public static int filledOrders(List<Integer> order, int k) {
		int sum = 0;
		int max = 0;
		// base conditions
		if (k < 0 || order.size() == 0) {
			return 0;
		}
		Collections.sort(order); // sorting order
		for (int i = 0; i < order.size(); i++) {
			sum += order.get(i);
			if (sum <= k) {
				max++; // normal test cases
			} else {
				return i; // corner test cases
			}
		}

		return max;

	}



	public static void main(String[] args) {

		List<Integer> order = new ArrayList<>();
		int n = 3;
		order.add(5);
		order.add(6);
		order.add(4);
		int k = 10;
		int result = filledOrders(order, k);
		System.out.println(result);
	}
}