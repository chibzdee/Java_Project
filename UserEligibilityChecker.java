import java.util.Scanner;

public class UserEligibilityChecker {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to my eligibility checker");
        System.out.println("Please provide your details below: ");

        System.out.println("Please enter your age here: ");
        int studentAge = keyboard.nextInt();

        System.out.println("Are you a student-staff? (true/false) ");
        boolean isStaffStudent = keyboard.nextBoolean();


        if (studentAge > 20 && !isStaffStudent) { // if the user is older than 20 and is not a student staff yet
            System.out.println("You're eligible to sign up for school jobs!");

        } else if (studentAge > 20 && isStaffStudent) {
            System.out.println("You can check eligibility for promotions! ");

        } else if (studentAge <= 20 && !isStaffStudent){
            System.out.println("Sorry, you're too young for a job right now! ");
        } else {
            System.out.println("....");
        }
    }
}