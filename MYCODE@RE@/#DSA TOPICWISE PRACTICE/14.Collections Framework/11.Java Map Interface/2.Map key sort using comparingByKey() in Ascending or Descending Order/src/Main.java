import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String args[]){

        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(101,"Deepak");
        map.put(100,"Vijay");
        map.put(102,"Rahul");

        /** Ascending Order */System.out.println("Ascending order:");
        //Returns a Set view of the mappings contained in this map
        map.entrySet()
                //Returns a sequential Stream with this collection as its source
                .stream()
                //Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByKey())
                //Performs an action for each element of this stream
                .forEach(System.out::println);


        /** Descending Order */System.out.println("Descending order:");
        //Returns a Set view of the mappings contained in this map
        map.entrySet()
                //Returns a sequential Stream with this collection as its source
                .stream()
                //Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                //Performs an action for each element of this stream
                .forEach(System.out::println);
    }
}  