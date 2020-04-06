class demo{
    String roll;
    String name;

    public demo(String roll,String name){
        this.roll = roll;
        this.name = name;
    }

    @Override  // It is not compulsory to write @Override.it shows that we're overriding an internal method.
    public String toString(){  // toSting is also a predefined method in java,here we're overriding toString method that return string value.
                                // For more info, select toString and press ctrl button.
        return "Roll number:  "+roll+"\n"+"Name :  "+name;
    }
}

public class Main {

    public static void main(String[] args) {

        demo ob = new demo("1VA18CS010","DEEPAK JAISWAL");
        System.out.println(ob);

    }
}
