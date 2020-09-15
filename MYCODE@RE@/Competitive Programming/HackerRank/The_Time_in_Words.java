import java.io.*;
/**
Important steps to keep in mind.
1. Create lists of word representations for hour and minute counts. i.e, [one, two,...twelve] and [one, two,...twenty one, twenty two...twenty nine].
2. Handle special cases, such as those which occur when the minutes are 0, 15, 30, 45.
3. If minutes > 30, then compute 60-(minutes) since we will need to report the number of minutes left for the next hour.
4. Take care of the singular case for minute vs. minutes.

*/
public class The_Time_in_Words {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /* Inputting hours and minutes */

        int h = Integer.parseInt(br.readLine());

        int m = Integer.parseInt(br.readLine());

        if ((h >= 1 && h <= 12) && (m >= 0 && m <= 59)) { // checking whether given input is legal or not.
            /* creating an array containing numbers from 1-29 in words */

            String words[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                              "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
                              "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five",
                              "twenty six", "twenty seven", "twenty eight", "twenty nine"
                             };

            /* The below code is for finding whether to print the word 'minute' or 'minutes' */
            String plu, a;
            if (m == 1 || m == 59)
                plu = "minute";
            else
                plu = "minutes";

            /* When we have minutes from 31-59, we print the hour ahead of the given hour
             * like 6:55 will be 5 minutes to 7 and not 5 minutes to 6
             * when we print the hour ahead of the given hour, we face a problem at hour = 12
             * because if we print an hour ahead of 12, it will be thirteen, but we want 1
             * so the below code checks this & decides what hour to print in words when minutes is from 31-59
             */
            if (h == 12)
                a = words[1]; //storing 'one' when hour is 12
            else
                a = words[h + 1]; //if hour is not 12, then storing in words, an hour ahead of given hour

            /* The below code checks minutes and accordingly prints the time in words using array. */
            //System.out.print("Output : "+h+":"+m+" ----- "); //printing the given time in numbers

            if (m == 0)
                System.out.println(words[h] + " o' clock");
            else if (m == 15)
                System.out.println("quarter past " + words[h]);
            else if (m == 30)
                System.out.println("half past " + words[h]);
            else if (m == 45)
                System.out.println("quarter to " + a);
            else if (m < 30) // condition for minutes between 1-29
                System.out.println(words[m] + " " + plu + " past " + words[h]);
            else // condition for minutes between 31-59
                System.out.println(words[60 - m] + " " + plu + " to " + a);
        } //end of outer if

        else
            System.out.println("Invalid Input !"); //printing error message for illegal input
    }
}