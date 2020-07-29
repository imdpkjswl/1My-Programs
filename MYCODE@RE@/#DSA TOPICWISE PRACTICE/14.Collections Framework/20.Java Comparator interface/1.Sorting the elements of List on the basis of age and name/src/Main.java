import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
}

class AgeComparator implements Comparator {
    public int compare(Object o1,Object o2){
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;

        if(s1.age == s2.age)
            return 0;
        else if(s1.age > s2.age)
            return 1;
        else
            return -1;
    }
}


class NameComparator implements Comparator{
    public int compare(Object o1,Object o2){
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;

        return s1.name.compareTo(s2.name);
    }
}


class Main {
    public static void main(String args[]){

        ArrayList al=new ArrayList();
        al.add(new Student(101,"Varun",23));
        al.add(new Student(106,"David",27));
        al.add(new Student(105,"Alan",21));

        System.out.println("Sorting by Name");

        Collections.sort(al, new NameComparator());
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            Student st=(Student)itr.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        System.out.println("\nSorting by age");

        Collections.sort(al, new AgeComparator());
        Iterator itr2=al.iterator();
        while(itr2.hasNext()){
            Student st=(Student)itr2.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }


    }
}