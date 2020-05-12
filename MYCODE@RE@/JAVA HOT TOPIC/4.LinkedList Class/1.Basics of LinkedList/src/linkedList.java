import java.util.LinkedList;
import java.util.ListIterator;

public class linkedList {
    public static void main(String... args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(12);
        list.add(15);
        list.add(13);
        list.add(17);
        list.add(34);

        System.out.println(list);
        // Removing elements from the linked list
        list.remove(3);
        list.removeFirst();
        list.removeLast();
        System.out.println("Linked list after deletion: " + list);

        // Number of elements in the linked list
        System.out.println("Size of linked list = " + list.size());

        // Finding elements in the linked list
        boolean status = list.contains(13);

        if (status)
            System.out.println("List contains the element '13' ");
        else
            System.out.println("List doesn't contain the element '13'");

        // Set(means: Replace) item into linkedlist
        list.set(1, 16);
        System.out.println("Linked list after change : " + list);

        // Add item into linkedList at any index
        list.add(2, 17);
        list.add(3, 18);

        // get any value from linked list
        System.out.println(list.get(2));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        // Get class and package
        System.out.println(list.getClass());
        System.out.println(list);

        // Inserting first and last of the linkedlist
        list.offerFirst(14);
        list.offerLast(19);
        list.offer(20);



        //Retrieve the first element of this list,if doesn't contain ot return null
        System.out.println("First element of list:  "+list.peekFirst());

        //Retrieve the last element of this list,if doesn't contain ot return null
        System.out.println("Last element of list:  "+list.peekLast());

        //Retrieves and removes the first element of this list, or returns null if this list is empty
        System.out.println("Removed First:  "+list.pollFirst());
        //Retrieves and removes the Last element of this list, or returns null if this list is empty
        System.out.println("Removed Last:  "+list.pollLast());


        //method Pops an element from the stack represented by this list
        System.out.println("Popped:  "+list.pop());// it will remove at front
        //method Push an element from the stack represented by this list
        list.push(14);  // it will add at front




        //Traversal in linkedlist
        // Setting the ListIterator at a specified position
        ListIterator i = list.listIterator();
        // Iterating through the created list from the position
        System.out.println("The Iterator list is as follows:");
        while (i.hasNext()) {
            System.out.print(i.next() + "  ");
        }


        //Clear linkedlist at once
        list.clear();

    }
}