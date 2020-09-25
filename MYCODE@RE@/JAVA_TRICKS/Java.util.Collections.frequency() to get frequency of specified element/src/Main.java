import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Let us create a list of strings
        List<String> myList = new ArrayList<String>();
        myList.add("practice");
        myList.add("code");
        myList.add("code");
        myList.add("every");
        myList.add("day");

        // Here we are using frequency() method to get  frequency of element "code"
        int freq = Collections.frequency(myList, "code");
        System.out.println(freq);

    }
}
