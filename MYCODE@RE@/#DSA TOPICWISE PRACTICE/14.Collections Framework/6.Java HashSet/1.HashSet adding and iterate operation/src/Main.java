import java.util.*;

/** Notice: The elements iterate in an unordered collection.   */

class Main {

    public static void main(String args[]){

        //Creating HashSet and adding elements
        HashSet<String> set=new HashSet();

        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        //ignoring duplicate elements
        set.add("One");
        
        Iterator<String> i=set.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }

    }
}  