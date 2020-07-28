import java.util.Iterator;
import java.util.PriorityQueue;

class Main {
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.add(8);
        pq.add(123);
        pq.add(42);
        pq.add(877);
        pq.add(4321);
        pq.add(6);

        System.out.println("head:"+pq.element());
        System.out.println("head:"+pq.peek());

        System.out.println("iterating the queue elements:");
        Iterator itr= pq.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        pq.remove();
        pq.poll();
        System.out.println("after removing two elements:");
        Iterator<Integer> itr2= pq.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}  