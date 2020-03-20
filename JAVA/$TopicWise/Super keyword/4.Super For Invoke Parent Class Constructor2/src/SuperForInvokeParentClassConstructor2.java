class Animal {  
 
    Animal(String name, String usn) {
        System.out.println("Animal is created");
        System.out.println("Name: "+name+"\nRoll no.: "+usn+"\n");
    }  
}  

class Dog extends Animal {  
    
    Dog(String name,String usn) {  
        super(name,usn);  
        System.out.println("Dog is created");  
    }  
}

class SuperForInvokeParentClassConstructor {  
    
    public static void main(String args[]) {  
    
        String name = "DEEPAK",usn = "1VA18CS010";
        
        Dog d=new Dog(name,usn);  
    }
}  
