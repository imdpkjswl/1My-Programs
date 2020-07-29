import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String args[]) {

        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        System.out.println("Initial list of elements: "+hm);

        hm.put(100,"Deepak");
        hm.put(101,"Vijay");
        hm.put(102,"Rahul");

        System.out.println("After invoking put() method ");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        hm.putIfAbsent(103, "Gaurav");
        System.out.println("After invoking putIfAbsent() method ");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }



        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(104,"Ravi");
        map.putAll(hm); // Put all hm elements into map.
        System.out.println("After invoking putAll() method ");
        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }


        //key-based removal
        map.remove(100);
        System.out.println("Updated list of elements: "+map);

        //key-value pair based removal
        map.remove(102, "Rahul");
        System.out.println("Updated list of elements: "+map);


        // HashMap to replace() elements
        map.replace(103, "David");
        System.out.println("Updated list of elements: "+map);

        hm.clear();
        System.out.println("Updated hm: list of elements: "+hm);

        map.replace(101, "Vijay", "John");
        System.out.println("Updated list of elements: "+map);



    }
}  