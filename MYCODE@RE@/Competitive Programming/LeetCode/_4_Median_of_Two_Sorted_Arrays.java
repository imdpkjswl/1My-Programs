
class _4_Median_of_Two_Sorted_Arrays {

	// Time Complexity: O(m+n) & Auxiliary Space: O(N)
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int len = m+n;
        
        double res = 0;

        // Handling Corner Cases
        if(m == 0 && n == 0)
            return res;
        else if(m == 0 && n != 0){
        	if(n%2 != 0){
        		n = (n/2); // odd
        		res = nums2[n];
        		return res;
        	}else{
        		n = n/2;
        		res = (nums2[n-1] + nums2[n])/2.0;
        		return res;
        	}    
        }
        else if(m != 0 && n == 0){
        	if(m%2 != 0){
        		m = (m/2); // odd
        		res = nums1[m];
        		return res;
        	}else{
        		m = m/2;
        		res = (nums1[m-1] + nums1[m])/2.0;
        		return res;
        	}  
        }else{
        	// Merging start here 
        	int i=0,j=0,k=0;
        	int[] nums = new int[len];
        	while(i < m && j < n){
        		if(nums1[i] <= nums2[j]){
        			nums[k++] = nums1[i++];
        		}else{
        			nums[k++] = nums2[j++];
        		}
        	}
        	while(i<m){
        		nums[k++] = nums1[i++];
        	}
        	while(j<n){
        		nums[k++] = nums2[j++];
        	}

        	if(len%2 != 0){
        		len = (len/2); // odd
        		res = nums[len];
        		return res;
        	}else{
        		len = len/2;
        		res = (nums[len-1] + nums[len])/2.0;
        		return res;
        	}  
        }
        
    }


    public static void main(String[] args){
    	int[] nums1 = {1,3};
    	int[] nums2 = {2, 5};

    	double result = findMedianSortedArrays(nums1, nums2);
    	System.out.println(result);

    }


}