import java.util.Scanner; // Using the scanner class to take in user input

public class CollectingInput {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your name here: ");
        String name = keyboard.next(); // Takes in string inputs

        System.out.println("Enter your age here: ");
        int age = keyboard.nextInt();  // Takes in integer inputs

        System.out.println("My name is " +name + ". I am " +age +" years old");
    }
}
