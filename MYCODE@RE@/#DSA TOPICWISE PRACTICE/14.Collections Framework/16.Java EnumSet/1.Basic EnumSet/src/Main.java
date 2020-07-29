import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}


public class Main {
    public static void main(String[] args) {

        Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY); // limit days
        // Traversing elements
        Iterator<days> it = set.iterator();
        while (it.hasNext())
            System.out.println(it.next());


        // Print all days
        Set<days> set1 = EnumSet.allOf(days.class);  // select all days.
        // Traversing elements
        Iterator<days> i = set1.iterator();
        while (i.hasNext())
            System.out.print(i.next()+"  ");


    }
}  