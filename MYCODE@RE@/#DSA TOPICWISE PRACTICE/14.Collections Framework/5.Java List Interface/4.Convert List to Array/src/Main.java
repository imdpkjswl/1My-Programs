import java.util.*;

public class Main {

    public static void main(String args[]){

        List<String> fruitList = new ArrayList<>();

        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Strawberry");

        //Converting ArrayList to Array
        String[] array = fruitList.toArray(new String[fruitList.size()]);

        System.out.println("Printing Array: "+Arrays.toString(array));
        System.out.println("Printing List: "+fruitList);
    }
}  