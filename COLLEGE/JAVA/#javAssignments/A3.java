import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char gender, mStatus;
        Scanner sc = new Scanner(System.in);

        String firstName, lastName;
        int age;

        System.out.print("What is your gender (M or F): ");
        gender = sc.next().charAt(0);

        if (('F' == gender) || ('M' == gender))
        {
            System.out.print("First Name: ");
            firstName = sc.next();
            System.out.print("Last Name: ");
            lastName = sc.next();
            System.out.print("Age: ");
            age = sc.nextInt();

            if (age < 0)
            {
                System.out.println("Invalid age entered.");
                System.exit(0);
            }

            if (age >= 20)
            {
                System.out.print("Are you married, " + firstName + " (Y or N): ");
                mStatus = sc.next().charAt(0);

                if ('Y' == mStatus)
                {
                    if (gender == 'F')
                    {
                        System.out.println("Then I shall call you Mrs. " + firstName + " " + lastName);
                    }

                    if ((gender == 'M'))
                    {
                        System.out.println("Then I shall call you Mr. " + firstName + " " + lastName);
                    }
                }

                else if('N' == mStatus)
                {
                    if (gender == 'F')
                    {
                        System.out.println("Then I shall call you Ms. " + firstName + " " + lastName);
                    }

                    if ((gender == 'M'))
                    {
                        System.out.println("Then I shall call you Mr. " + firstName + " " + lastName);
                    }
                }

                else
                {
                    System.out.println("Invalid marriage status entered.");
                    System.exit(0);
                }
            }

            else
            {
                if (gender == 'F')
                {
                    System.out.println("Then I Shall Call You " + firstName + " " + lastName);
                }

                if ((gender == 'M'))
                {
                    System.out.println("Then I Shall Call You " + firstName + " " + lastName);
                }
            }
        }

        else
        {
            System.out.println("Invalid gender entered.");
            System.exit(0);
        }
    }
}