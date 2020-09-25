/**
User-defined FastReader Class- (which uses bufferedReader and StringTokenizer):
    This method uses the time advantage of BufferedReader and StringTokenizer and
    the advantage of user defined methods for less typing and therefore a faster
    input altogether. This method is very much recommended as it is easy to remember
    and is fast enough to meet the needs of most of the question in competitive coding.
*/
// Working program with FastReader
public class Main {

    public static void main(String[] args) {

        FastReader s = new FastReader();
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        int sum = num1 + num2;
        System.out.println(sum);
    }
} 