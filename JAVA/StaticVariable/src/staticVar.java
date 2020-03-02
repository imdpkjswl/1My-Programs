class Employee {

    // static variable salary
     static double salary;
     static String name = "Deepak";
}

class staticVar {
    public static void main(String[] args)
    {

        // accessing static variable without object
        Employee.salary = 1000000;
        System.out.println(Employee.name + "'s average salary : " + Employee.salary);
    }
}