import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Main {
    public static void main(String args[]){

        Map<Integer,String> map=new HashMap<Integer,String>();

        map.put(100,"Deepak");
        map.put(101,"John");
        map.put(102,"Sunil");


        // OLD METHOD FOR TRAVERSE: NON-GENERIC
        System.out.println("*Traverse using Set:");
        // converting into set, so that we can traverse.
        Set set = map.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()){
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry entry = (Map.Entry)it.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


        // NEW METHOD FOR TRAVERSE: GENERIC
        System.out.println("*Traverse using Enhanced For Loop:");
        //Elements can traverse in any order
        for(Map.Entry m :  map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }


    }
}  