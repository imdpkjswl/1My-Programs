// To creating abstract class, we need to use abstract keyword.

abstract class father{
    abstract void disp(); // no body, is call abstract method
}

class son extends father{

    void disp(){
        System.out.println("Abstract method defined inside sub class son");
    }
}

class daughter extends father{

    void disp(){
        System.out.println("abstract method defined inside sub class daughter");
    }

}



public class Abst {
    public static void main(String [] args){

        son sobj = new son();
        sobj.disp();


        daughter dobj = new daughter();
        dobj.disp();

    }
}
