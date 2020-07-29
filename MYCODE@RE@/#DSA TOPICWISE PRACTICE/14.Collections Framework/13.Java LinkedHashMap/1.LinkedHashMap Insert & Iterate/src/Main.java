import java.util.LinkedHashMap;
import java.util.Map;

class Main {
    public static void main(String args[]){

        LinkedHashMap<Integer,String> linkmap = new LinkedHashMap<Integer,String>();

        linkmap.put(100,"Deepak");
        linkmap.put(101,"Vijay");
        linkmap.put(102,"Rahul");

        for(Map.Entry m:  linkmap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }


        // Key-Value pair
        //Fetching key
        System.out.println("Keys: "+linkmap.keySet());
        //Fetching value
        System.out.println("Values: "+linkmap.values());
        //Fetching key-value pair
        System.out.println("Key-Value pairs: "+linkmap.entrySet());

        // Remove element
        System.out.println("Before invoking remove() method: "+linkmap);
        linkmap.remove(102);
        System.out.println("After invoking remove() method: "+linkmap);


    }
}  