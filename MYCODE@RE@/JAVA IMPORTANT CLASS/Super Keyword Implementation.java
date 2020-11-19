import java.util.*;

class child{
    
    child(int a){
        System.out.println(a);        
    }
}

class child1 extends child{
    child1(int a,int b){
        super(a);
            System.out.println(b);
    }
}

class child2 extends child1{
    child2(int a,int b,int c){
        super(a,b);
        System.out.println(c);
    }
}

class Main{
    public static void main(String [] args){
        
        child2 obj = new child2(1,2,3); // All three class constructor will called by super keyword.
    }
}