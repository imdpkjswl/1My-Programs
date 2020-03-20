class Person {  
    int id;  
    String name;  
    
    Person(int id,String name){  
        this.id=id;  
        this.name=name;  
    }  
}  

class Emp extends Person{  
    float fee;  

    Emp(int id,String name,float fee){  
        super(id,name);//reusing parent constructor  
        this.fee=fee;  
    }  

    void display(){
        System.out.println(id+" "+name+" "+fee);
    }  
}

class ReusingOfParentClassConstructor {  
    public static void main(String[] args){  
    Emp e1=new Emp(010,"Deepak",130680f);  
    e1.display();  
    
    }
}  