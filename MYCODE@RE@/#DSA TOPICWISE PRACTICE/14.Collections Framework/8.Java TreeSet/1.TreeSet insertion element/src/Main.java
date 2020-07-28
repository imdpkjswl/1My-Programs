import java.util.*;

class Main {
    public static void main(String args[]){

        TreeSet<Integer> set=new TreeSet<Integer>();
        set.add(12);
        set.add(43);
        set.add(23);
        set.add(12);  // ignored duplicates
        set.add(65);


        System.out.println("Traversing element through Iterator in ascending order");
        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Traversing element through Iterator in descending order");
        Iterator i=set.descendingIterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }



        System.out.println("Initial Set: "+set);

        System.out.println("Reverse Set: "+set.descendingSet());

        System.out.println("Head Set: "+set.headSet(23, true));

        System.out.println("SubSet: "+set.subSet(12, false, 65, true));

        System.out.println("TailSet: "+set.tailSet(23, false));


        System.out.println("Lowest Value: "+set.pollFirst());
        System.out.println("Highest Value: "+set.pollLast());


    }
} 