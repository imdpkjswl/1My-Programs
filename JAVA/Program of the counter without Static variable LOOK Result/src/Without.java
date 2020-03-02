public class Without {

    //Java Program to demonstrate the use of an instance variable
//which get memory each time when we create an object of the class.
    int count=0;//will get memory each time when the instance is created

        Without(){
            count++;//incrementing value
            System.out.println(count);
        }

        public static void main(String args[]){
//Creating objects
            Without c1 = new Without();
            Without c2 = new Without();
            Without c3 = new Without();

            // At Last: We get the same output every call,due to vanishes of variable every time..
        }

}
