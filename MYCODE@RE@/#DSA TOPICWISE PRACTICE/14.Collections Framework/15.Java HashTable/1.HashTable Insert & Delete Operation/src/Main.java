import java.util.Hashtable;

public class Main {
    public static void main(String args[]) {

        Hashtable<Integer,String> ht = new Hashtable<Integer,String>();

        ht.put(100,"Deepak");
        ht.put(102,"Ravi");
        ht.put(101,"Vijay");
        ht.put(103,"Rahul");

        System.out.println("Before remove: "+ ht);

        // Remove value for key 102
        ht.remove(102);

        System.out.println("After remove: "+ ht);



        //Here, we specify the if and else statement as arguments of the method
        System.out.println(ht.getOrDefault(101, "Not Found"));
        System.out.println(ht.getOrDefault(105, "Not Found"));


        //Inserts, as the specified pair is unique
        ht.putIfAbsent(104,"Gaurav");
        System.out.println("After Insertion: "+ ht);

    }
}  