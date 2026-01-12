import java.util.Scanner;

// The switch expression is evaluated once
// The result is compared with each case value
// If there's a match, the matching block of code runs
// The  break statements stops the switch after the matching case had ran
// The default statement runs if there is no match


public class SwitchStatements {
    public static void main(String[] args) {

        // We'll use the switch statements to evaluate the day of the week

        int day = 4;
        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Looking forward for the weekend");
        }


    }

}
