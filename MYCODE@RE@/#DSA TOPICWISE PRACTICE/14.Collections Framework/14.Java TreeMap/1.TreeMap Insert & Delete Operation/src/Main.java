import java.util.Map;
import java.util.TreeMap;

class Main {
    public static void main(String args[]){
        TreeMap<Integer,String> map=new TreeMap<Integer,String>();
        map.put(100,"Deepak");
        map.put(102,"Ravi");
        map.put(101,"Vijay");
        map.put(103,"Rahul");

        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        map.remove(102);  // remove 102 key element
        System.out.println("After invoking remove() method");
        for(Map.Entry m:map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        
    }
}  