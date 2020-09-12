import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Taum_and_Bday {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();

    for (int i = 1; i <= t; i++) {
      long b = in.nextLong();
      long w = in.nextLong();
      long bc = in.nextLong();
      long wc = in.nextLong();
      long z = in.nextLong();

      int flag = 0;
      if (bc + z < wc) {
        System.out.println((long)(b * bc) + (w * bc) + (w * z));
      } else if (wc + z < bc) {
        System.out.println((long)(b * wc) + (w * wc) + (b * z));
      } else if (bc == wc) {
        System.out.println((long)(b * bc) + (w * wc));
      } else {
        System.out.println((long)(b * bc) + (w * wc));
      }
    }
  }
}