import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Main {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String[] timesplits = s.split(":");
        int hours = Integer.parseInt(timesplits[0]);
        String meridian = timesplits[timesplits.length -1];
        String hoursString = "";
        if(meridian.contains("AM")) {
            hoursString = hours == 12 ? "00": timesplits[0];
        } else if(meridian.contains("PM")) {
            hours = hours + 12;
            hoursString = hours == 24 ? "12": hours+"";
        }

        return hoursString+":"+timesplits[1]+":"+timesplits[2].substring(0,2);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        String s = "07:05:45PM";
        String result = timeConversion(s);
        System.out.println(result);

        s = "07:05:45AM";
        result = timeConversion(s);
        System.out.println(result);

    }
}
