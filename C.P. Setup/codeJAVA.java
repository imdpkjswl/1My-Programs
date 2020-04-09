import java.io.*;
import java.util.*;

class codeJAVA {
	public static void main(String []args) throws Exception {


		// pass the path to the file as a parameter 
    	FileReader inputFile;

        inputFile = new FileReader("input.txt"); 
  
    	int i; 
    	while ((i=inputFile.read()) != -1)System.out.print((char) i); 

		System.out.println("Hello World!!!");
	}
}