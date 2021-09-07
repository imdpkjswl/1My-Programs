/*
Example output:
Enter any number to print Prime factors: 51
All Prime Factors of 51 are:
3, 17
*/
public class PrimeFactors {
    static void factors(int[] arr, int num) {
        int i=0, j=0;

        for(i=1;i<num/2;i++){
            if((num % i) == 0){
                arr[j++] = i; // store factors
            }
        }
    }

    public static void main(String[] args) {
        int num = 51;

        int[] arr = new int[num];

        factors(arr, num);

        for(int i=1;i<num;i++){
            if(arr[i] !=0) { // print factors except 1 and num
                System.out.print(arr[i] + " ");
            }
        }
    }
}
