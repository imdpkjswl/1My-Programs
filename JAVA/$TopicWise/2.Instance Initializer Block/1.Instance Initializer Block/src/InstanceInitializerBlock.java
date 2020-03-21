/** 
    *** Rules for instance initializer block :
	**There are mainly three rules for the instance initializer block. They are as follows:
	*The instance initializer block is created when instance of the class is created.
	*The instance initializer block is invoked after the parent class constructor is invoked (i.e. after super() constructor call).
	*The instance initializer block comes in the order in which they appear.

*/

class InstanceInitializerBlock {  
    int speed;  
      
    InstanceInitializerBlock(){
        System.out.println("speed is "+speed);
    }  
   
    {speed=100;}  
     
    // Note: Constructor vs Initializer, Intializer block will invoked first in a same class.
    public static void main(String args[]){  
    InstanceInitializerBlock  b1 = new InstanceInitializerBlock();  
    InstanceInitializerBlock b2 = new InstanceInitializerBlock();  
    }      
}  