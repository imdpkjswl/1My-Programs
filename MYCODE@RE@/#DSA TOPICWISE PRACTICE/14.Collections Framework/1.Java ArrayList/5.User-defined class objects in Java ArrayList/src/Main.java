import java.util.ArrayList;
import java.util.Iterator;

class student{
    String usn;
    String name;
    int age;
    student(String usn, String name, int age){
        this.usn = usn;
        this.name = name;
        this.age = age;
    }
}


public class Main {

    public static void main(String[] args) {
        //creating arraylist
        ArrayList<student> al = new ArrayList<student>();

        //Creating user-defined class objects
        student s1 = new student("1VA18CS10", "DJ", 20);
        student s2 = new student("1VA18CS010", "DEEPAK", 21);
        student s3 = new student("1VA18CS0010", "D JAISWAL", 22);
        student s4 = new student("1VA18CS00010", "DEEPAK JAISWAL",23 );

        //adding Student class object
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);

        // Getting iterator
        Iterator it = al.iterator();
        while (it.hasNext()){
            student st = (student) it.next();  // narrowing
            System.out.println(st.usn + "\t" + st.name + "\t" + st.age);
        }


    }
}
