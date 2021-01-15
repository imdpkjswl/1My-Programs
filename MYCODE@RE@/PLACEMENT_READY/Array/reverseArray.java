class reverseArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};

		int i = 0;
		int j = arr.length-1;
		int tmp;
		while( i < j ) {
			tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
			i++;
			j--;
		}

		for(int val: arr) {
			System.out.print(val + "  ");
		}
	}

}