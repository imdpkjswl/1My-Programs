import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * Sample Input 0
 *
 * 4
 * 73
 * 67
 * 38
 * 33
 * Sample Output 0
 *
 * 75
 * 67
 * 40
 * 33

 * Student 1 received a 73, and the next multiple of 5 from 73 is 75. Since 75-73 <3, the student's grade is rounded to 75.
 * Student 2 received a 67, and the next multiple of 5 from 67 is 70. Since ,70-67 ==3 the grade will not be modified and the student's final grade is 67.
 * Student 3 received a 38, and the next multiple of 5 from 38 is 40. Since ,40-38 <3, the student's grade will be rounded to 40.
 * Student 4 received a grade below 38, so the grade will not be modified and the student's final grade is 33.
 */


class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {

        for(int a0 = 0; a0 < grades.size(); a0++){
            int grade = grades.get(a0);


            int newGrade = ((grade / 5) + 1) * 5;

            if(newGrade < 40)
            {
                continue;
            }

            if(newGrade - grade < 3){
                grades.set(a0,newGrade);
            }
            else
                continue;
        }

        return grades;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

        List<Integer> grades = new ArrayList<>();

        grades.add(0,73);
        grades.add(1,67);
        grades.add(2,38);
        grades.add(3,33);

        List<Integer> result = Result.gradingStudents(grades);

        Iterator i = result.iterator();
        System.out.println("The Output is:");
        while (i.hasNext()) {
            System.out.println(i.next());
        }


    }
}
