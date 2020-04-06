public class Main {

    public static void main(String[] args) {

        String str;
        str = "Moon,Mars,Neptune, Earth,Sun";

        // After splitting, we'll get a String array.
        String []names = str.split(","); // Wherever string is separated by comma,it gets break into sub string and stored in string array.


        for(int i=0; i<names.length; i++)
            System.out.println(names[i]);

    }
}
