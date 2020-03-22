import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        int sub,i;
        float totalM=0 , totalC=0 ;
        float mark[] = new float[10];
        float credit[] = new float[10];
        float grade[] = new float[10];
        float percent, gpa=0;

        System.out.println("Enter the number of subjects");
        sub = in.nextInt();

        for(i=0;i<sub;i++){
            System.out.println("Enter "+(i+1)+" subject mark");
            mark[i] = in.nextInt();
            totalM += mark[i];
            System.out.println("Enter "+(i+1)+" subject credit");
            credit[i] = in.nextInt();
            totalC += credit[i];
            System.out.println("Enter "+(i+1)+" subject grade");
            grade[i] = in.nextInt();
            gpa += grade[i]*credit[i];
        }

        System.out.println("MARKS\tCREDITS\t\tGRADE");
        for(i=0;i<sub;i++){
            System.out.println(mark[i]+"\t"+credit[i]+"\t\t\t"+grade[i]);
        }
        System.out.println();
        gpa = gpa/totalC;
        percent  = totalM/sub;
        System.out.println("Obtained Percentage :  "+percent);
        System.out.println("Obtained GPA :  "+gpa);



    }
}
