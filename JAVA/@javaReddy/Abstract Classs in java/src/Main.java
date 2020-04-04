// Note: Abstract class must having abstract method.
abstract class iphone4 {  // Abstract class
    public void call(){
        System.out.println("Calling...(2010)");
    }
    public abstract void media();
    public abstract void internet();
    public abstract void videoCall();
}

abstract class iphone5 extends iphone4 {  // Abstract class
    public void media(){
        System.out.println("Media...(2012)");
    }
}

class iphone6 extends iphone5 {  // Concrete class
    public void internet(){
        System.out.println("Internet...(2013)");
    }

    public void videoCall(){
        System.out.println("Video Call...(2016)");
    }
}


public class Main {

    public static void main(String[] args) {

        iphone4 i = new iphone6();

        i.call();
        i.media();
        i.internet();
        i.videoCall();
    }
}
