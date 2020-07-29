import java.util.LinkedHashMap;
import java.util.Map;

class Book {
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}



public class Main {
    public static void main(String[] args) {

        //Creating map of Books
        Map<Character,Book> map = new LinkedHashMap<Character, Book>();

        //Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);

        //Adding Books to map
        map.put('b',b2);
        map.put('a',b1);
        map.put('c',b3);

        //Traversing map: Un-order traverse
        for(Map.Entry<Character, Book> entry: map.entrySet()){
            Character key=entry.getKey();
            Book b=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }


    }
}    