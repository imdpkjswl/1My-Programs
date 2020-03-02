public class Local {
    public void StudentAge()
    {
        // local variable age , Always declared inside class of method.
        int age = 0;
        age = age + 19;
        System.out.println("Student age is : " + age);
    }

    public static void main(String args[])
    {
        Local obj = new Local(); // Create object of class.
        obj.StudentAge(); // Calling Method.
    }
}