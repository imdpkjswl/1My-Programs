import javax.naming.Name;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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


class AgeComparator implements Comparator<Student> {
    public int compare(Student s1,Student s2){
        if(s1.age==s2.age)
            return 0;
        else if(s1.age>s2.age)
            return 1;
        else
            return -1;
    }
}


class NameComparator implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.name.compareTo(s2.name);
    }
}


class Main {
    public static void main(String args[]){

        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(101,"Varun",23));
        al.add(new Student(106,"Deepak",27));
        al.add(new Student(105,"Dhruv",21));

        System.out.println("Sorting by Name");

        NameComparator nameComparator = new NameComparator();
        Collections.sort(al, nameComparator);
        for(Student st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        System.out.println("Sorting by age");

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(al,ageComparator);
        for(Student st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }


    }
}
