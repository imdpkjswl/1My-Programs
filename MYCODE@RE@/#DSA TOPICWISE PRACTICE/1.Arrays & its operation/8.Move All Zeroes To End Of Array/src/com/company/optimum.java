class optimum {
    public static void main(String[] args) {
        int[] arr = {1,2,0,0,3,0,5,0};
        int n = arr.length;
        int i=0,j=n-1;

        while(i<j){
            if(arr[i]==0&&arr[j]!=0){ // swap when left found zero and right found non-zero element.
                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
                i++; j--;
            }
            //System.out.println(i+" "+j);
	
	    // Move right	
            if(arr[i]!=0){
                i++;
            }
            
            // Move left
            if(arr[j]==0){
                j--;
            }
        }

        for(int val:arr){
            System.out.print(val+" ");
        }

    }
}