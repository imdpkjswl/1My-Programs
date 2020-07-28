import java.util.*;


// Here you can notice that the elements iterate in insertion order.
class Main {

    public static void main(String args[]){

        //Creating HashSet and adding elements
        LinkedHashSet<String> set=new LinkedHashSet();

        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        // Ignoring duplicates
        set.add("Two");

        Iterator<String> i = set.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }

    }
}  