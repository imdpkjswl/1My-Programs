// 1.Sort the finishing time of activity.
// 2.Print First activity and then compare finishing time of current activity with starting time of activity of next activity.
// 3.if current finish is less then next start then print activity. otherwise skip.

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] start =  {1, 3, 0, 5, 8, 5};
        int[] finish =  {2, 4, 6, 7, 9, 9};
        int n = start.length; // both array size must be same.
        char[] name = new char[n];
        char ch = 'a';
        for(int i=0;i<n;i++){
            name[i] = ch;
            ch++;
        }


        // Apply bubble sort
        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++){
                if(finish[j] >= finish[j+1]){
                    int temp = finish[j];
                    finish[j] = finish[j+1];
                    finish[j] = temp;

                    // relative start also be placed.
                    int t = start[j];
                    start[j] = start[j+1];
                    start[j+1] = t;

                    // Replace activity name
                    char c = name[j];
                    name[j] = name[j+1];
                    name[j+1] = c;
                }
            }
        }
        System.out.println(Arrays.toString(name));


        for(int i=0;i<n;i++){
            System.out.print(start[i]+"  ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(finish[i]+"  ");
        }


        int i=0;
        System.out.print("\nSelected activities are:  "+name[i]+" ");
        for(int j=1;j<n;j++){
            if(finish[i] <= start[j]){
                System.out.print(name[j]+" ");
                i = j;
            }
        }

    }
}
