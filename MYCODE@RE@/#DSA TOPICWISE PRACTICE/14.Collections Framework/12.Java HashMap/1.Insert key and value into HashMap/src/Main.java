import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String args[]){

        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap

        //Put elements in Map
        map.put(1,"Mango");
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Grapes");
        map.put(2,"Dates"); // no duplicates key allowed
        map.put(5,""); // Java HashMap may have one null key and multiple null values.

        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }


    }
}  