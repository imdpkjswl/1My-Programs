// Definition: The super keyword in Java is a reference variable which is used to refer immediate parent class object.

class Animal{  
    String color="white";  
}  

class Dog extends Animal{  
    String color="black";
    
        void printColor(){  
            System.out.println(color);//prints color of Dog class  
            System.out.println(super.color);//prints color of Animal class i.e. refer immediate parent class 
        }  
}  

class SuperForInstanceVariable {  
    public static void main(String args[]) {  
        Dog d = new Dog();  
        d.printColor();  
    
    }
}  