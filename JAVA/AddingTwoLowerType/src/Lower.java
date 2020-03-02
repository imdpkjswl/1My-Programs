// Note:- In main method class at least one public specifier should be present.
public class Lower{

    public static void main(String[] args)
    {
        byte a=10;
        byte b=40;
        //byte c=a+b;//Compile Time Error: because a+b=20 will be int
        byte c=(byte)(a+b);
        System.out.println("Sum of " +a+ " and " + b +" byte type data is : " + c);


    }

}