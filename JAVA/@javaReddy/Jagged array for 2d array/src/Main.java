public class Main {

    public static void main(String[] args) {

        int arr[][] = new int[3][];


        arr[0] = new int[4]; // here, 4 is column and 0 is index i.e. row
        arr[1] = new int[2];
        arr[2] = new int[3];


        // Initializing array
        int count = 0;
        for (int i=0; i<arr.length; i++)  // row
            for(int j=0; j<arr[i].length; j++) // col
                arr[i][j] = count++;





        // Displaying the values of 2D Jagged array
        System.out.println("Contents of 2D Jagged Array using normal for loop: ");
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }



        System.out.println();

        // We can also use for each loop.
        System.out.println("Content of 2D Jagged Array using for each loop: ");
        for(int i[] : arr) {
            for(int j : i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
