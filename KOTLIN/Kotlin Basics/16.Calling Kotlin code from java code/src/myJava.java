

public class myJava {
    public static  void main(String[] args){
        int sum = MyKotlinKt.add(4,9);  // default package for calling kotlin methods
        System.out.println("Printing sum inside java class returning from kotlin file:  "+sum);
    }
}
