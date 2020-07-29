import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

/*
    @Override
    public int compareTo(Student st){
        if(age==st.age)
            return 0;
        else if(age>st.age)
            return 1;
        else
            return -1;
    }

 */
        // sorts the list elements on the basis of age in reverse order.
        @Override
        public int compareTo(Student st) {
            if (age == st.age)
                return 0;
            else if (age < st.age)
                return 1;
            else
                return -1;
        }

}  



public class Main {
    public static void main(String args[]){

        ArrayList<Student> al=new ArrayList<Student>();

        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));

        Collections.sort(al);
        for(Student st:al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }


    }
}  