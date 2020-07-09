package com.iamdj;


public class Main {

    static int coinMax(int[] arr, int l, int r) {
        if(l+1 == r){
            return Math.max(arr[l],arr[r]);
        }

        return Math.max(arr[l] + Math.min(coinMax(arr, l+2, r), coinMax(arr, l+1, r-1)),arr[r] + Math.min(coinMax(arr,l+1, r-1),coinMax(arr,l,r-2)));
    }

    public static void main(String[] args) {
        int [] arr= {1 ,5, 7, 3, 2, 4};
        System.out.println(coinMax(arr,0,arr.length-1));

    }
}
