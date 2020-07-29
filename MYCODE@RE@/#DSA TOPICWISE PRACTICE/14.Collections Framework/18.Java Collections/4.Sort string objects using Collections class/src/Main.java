import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Main {
    public static void main(String args[]){

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(43);
        al.add(98);
        al.add(32);
        al.add(56);

        System.out.println("Sorted in order:");
        Collections.sort(al);
        Iterator it =al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("Sorted in reversed order:");
        Collections.sort(al,Collections.reverseOrder());
        Iterator itr =al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}  