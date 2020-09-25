/**
 StringBuffer may have characters and substrings inserted in the middle or appended
 to the end. It will automatically grow to make room for such additions and often
 has more characters pre-allocated than are actually needed, to allow room for growth.
 */

public class Main {

    public static void main(String[] args) {

        StringBuffer s = new StringBuffer("iAmDeepak");
        int p = s.length();
        int q = s.capacity();
        System.out.println("Length of string iAmDeepak=" + p);
        System.out.println("Capacity of string iAmDeepak=" + q);

        //append( ): It is used to add text at the end of the existence text.
        // Here are a few of its forms:
        //StringBuffer append(String str)
        //StringBuffer append(int num)
        s.append("Jaiswal");
        System.out.println(s); // returns iAmDeepakJaiswal


        //insert( ): It is used to insert text at the specified index position.
        // These are a few of its forms:
        //StringBuffer insert(int index, String str)
        //StringBuffer insert(int index, char ch)
        s.insert(0, "Hello");
        System.out.println(s); // returns HelloiAmDeepakJaiswal



        //delete( ) and deleteCharAt( ): It can delete characters within a StringBuffer by using
        // the methods delete( ) and deleteCharAt( ).The delete( ) method deletes a sequence of
        // characters from the invoking object. Here, start Index specifies the index of the first
        // character to remove, and end Index specifies an index one past the last character to
        // remove. Thus, the substring deleted runs from start Index to endIndex–1. The deleteCharAt( )
        // method deletes the character at the index specified by loc.
        // These are a few of its forms:
        //StringBuffer delete(int startIndex, int endIndex)
        //StringBuffer deleteCharAt(int loc)
        s.delete(0, 5);
        System.out.println(s); // returns iAmDeepakJaiswal
        s.deleteCharAt(7);
        System.out.println(s); // returns iAmDeepkJaiswal



        //replace( ): It can replace one set of characters with another set inside a
        // StringBuffer object by calling replace( ). The substring being replaced is
        // specified by the indexes start Index and endIndex. Thus, the substring at
        // start Index through endIndex–1 is replaced. The replacement string is passed
        // in str.Its signature is shown here:
        //StringBuffer replace(int startIndex, int endIndex, String str)
        s.replace(3, 8, "LOVE");
        System.out.println(s); // returns iAmLOVEJaiswal


        //reverse( ): It can reverse the characters within a StringBuffer object using reverse( ).
        // This method returns the reversed object on which it was called.
        s.reverse();
        System.out.println(s);
    }
}
