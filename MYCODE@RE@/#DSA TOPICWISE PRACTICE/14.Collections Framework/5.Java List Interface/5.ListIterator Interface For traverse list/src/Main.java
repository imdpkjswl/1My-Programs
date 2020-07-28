import java.util.*;
public class Main {
    public static void main(String args[]){

        List<String> al=new ArrayList<String>();

        al.add("Deepak");
        al.add("DJ");
        al.add("Kumar");
        al.add(1,"John");

        ListIterator<String> itr=al.listIterator();
        System.out.println("Traversing elements in forward direction");
        while(itr.hasNext()){
            System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());
        }

        System.out.println("Traversing elements in backward direction");
        while(itr.hasPrevious()){
            System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());
        }
    }
}  