import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        // Using switch statements to design a calculator program

        System.out.println("Welcome to my calculator program");

        System.out.println("Enter the first number: ");
        int number1 = keyboard.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = keyboard.nextInt();


        System.out.println("Enter the operator here: ");
        if (keyboard.hasNextLine()){

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Looking forward for the weekend");
        }
        String operator = keyboard.nextLine();

        int result = 0;

            switch(operator)
            {
                case "+":
                    result = number1 + number2;
                    break;

                case "-":
                    result = number1 - number2;
                    break;

                case "*":
                    result = number1 * number2;
                    break;

                case "/":
                    result = number1 / number2;
                    break;

                default:
                    System.out.println(result);
            }

            System.out.println("Result: " +result);


    }
}
