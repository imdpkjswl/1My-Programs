/*
    * Types od interface:
    * 1.Normal Interface: We have seen in previous program.
    * 2.Single Abstract Method Interface: Which contain only one interface.It introduced in 1.8Java,i.e. Lambada expression( -> ).
    * 3.Marker interface : Which doesn't contain any method inside it.

 */


interface demo{
    void show();
}

public class Main {
    public static void main(String[] args) {
                // -> is called Lambada expression.

        demo ob = () -> System.out.println("Hello World...");
        ob.show();

	}
}
