import java.util.Scanner;

/*
For example consider the above example.

        arr[]  = {9:00,  9:40, 9:50,  11:00, 15:00, 18:00}
        dep[]  = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}

        All events sorted by time.
        Total platforms at any time can be obtained by subtracting total
        departures from total arrivals by that time.
        Time     Event Type     Total Platforms Needed at this Time
        9:00       Arrival                  1
        9:10       Departure                0
        9:40       Arrival                  1
        9:50       Arrival                  2
        11:00      Arrival                  3
        11:20      Departure                2
        11:30      Departure                1
        12:00      Departure                0
        15:00      Arrival                  1
        18:00      Arrival                  2
        19:00      Departure                1
        20:00      Departure                0

        Minimum Platforms needed on railway station = Maximum platforms
        needed at any time
        = 3
My approach: At beginning,merge the both array and sort them.After sorting represent the arrival as 1 and departure as 0.
At last, find the maximum frequency of arrival of train continuously.
*/
public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	int i,j,k,n,m;
	float []ar = new float[50];
	float []dep = new float[50];
	float []res = new float[100];
	System.out.println("Enter the no. of trains that will arrive");
	n = in.nextInt();
	for(i=0;i<n;i++)
	    ar[i] = in.nextFloat();

        System.out.println("Enter the no. of trains that will depart");
        m = in.nextInt();
        for(i=0;i<m;i++)
            dep[i] = in.nextFloat();

    // Copying ar and dep array into res array
    k=0;
    for(i=0;i<n;i++){
        res[k++] = ar[i];
    }
    for(i=0;i<m;i++){
        res[k++] = dep[i];
    }



    // Bubble sort
        float temp;
        for(j=1;j<(n+m);j++){
            for(i=0;i<(n+m)-j;i++)
            {
                if(res[i+1] <= res[i] ){
                    temp = res[i];
                    res[i] = res[i+1];
                    res[i+1] = temp;
                }
            }
        }


// here,i'm making arrival time as 1 and departure time as 0 by comparing ar and dep to res array.
    for(i=0;i<(n+m);i++){
        for(j=0;j<n;j++){
            if(res[i] == ar[j]) {
                res[i] = 1;
            }
        }
        for(k=0;k<m;k++){
            if(res[i] == dep[k]){
                res[i] = 0;
            }
        }
    }

    /// Checking continuous frequencies of 1 and counting as minimum no. of platforms required.
        n = n+m;
        int count=0;

        for(i=0;i<n;i++)
            System.out.println(res[i]);

     // Last sub Question rose:   1  0  1  1  1  0  0  0  1  1  0  0

        temp = 0;
        for(i=0; i<n; i++){

            if(res[i] == 0 ){
                count++;
            }else{
                count=0;
            }

            if(count > temp){
                temp = count ;
            }
        }

        System.out.println("Minimum platform required: "+temp);
    }
}
