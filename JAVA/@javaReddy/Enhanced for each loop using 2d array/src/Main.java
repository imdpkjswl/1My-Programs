public class Main {

    public static void main(String[] args) {

        int arr[][] = {
                            {2,3,4,5},
                            {3,6,8,9},
                            {8,1,2,3},
                            {4,5,6,9},
                            {1,2,3,4}
        };

        for(int i[] : arr) { // here , i is an array
            for (int j : i) { // here, j contain element present in 2d array
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }
}
