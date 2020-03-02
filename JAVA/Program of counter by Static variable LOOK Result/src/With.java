public class With {

    //Java Program to illustrate the use of static variable which
    //is shared with all objects.

        static int count=0;//will get memory only once and retain its value

        private With(){
            count++;//incrementing the value of static variable
            System.out.println(count);
        }

        public static void main(String args[]){
        //creating objects
            With c1 = new With();
            With c2 = new With();
            With c3 = new With();
            // Due to static keyword count will increase on each call .. .
        }

}
