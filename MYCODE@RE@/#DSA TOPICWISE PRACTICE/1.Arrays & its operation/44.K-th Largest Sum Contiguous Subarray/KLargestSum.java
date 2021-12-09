class KLargestSum {
	public static void main(String[] args) {

		int[] arr = new int[]{20, -5, -1};
		int k=3;		

		int n = 3, p=0;
					
		int[] ans = new int[n*(n+1)/2]; // required array

		for(int i=0;i<n;i++){
			int sum=0;
			for(int j=i;j<n;j++){
				sum += arr[j];
				ans[p++] = sum;
			}
		}

		for(int val:ans){
			System.out.print(val+" ");
		}

		System.out.println("\n"+ans[k-1]);	

	}

}