import java.util.ArrayList;
import java.util.Collections;


class Student implements Comparable<Student> {
    public String name;
    public Student(String name) {
        this.name = name;
    }
    public int compareTo(Student person) {
        return name.compareTo(person.name);

    }
}


public class Main {
    public static void main(String[] args) {
        // Create list
        ArrayList<Student> al=new ArrayList<Student>();

        // Create objects
        Student s1 = new Student("David");
        Student s2 = new Student("Alan");
        Student s3 = new Student("Peter");
        Student s4 = new Student("Alex");

        // insert objects
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);

        // sort objects
        Collections.sort(al);

        for (Student s : al) {
            System.out.println(s.name);
        }


    }
}