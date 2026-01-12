public class ternaryOperator {
    public static void main(String[] args){

        // Short-hand if-else statements

        // variable = (condition) ? expressionTrue: expressionFalse;

//        int time = 20;
//        if (time < 18){
//            System.out.println("Good day");
//
//        } else {
//            System.out.println("Good evening");
//        }

        // could be written as:

//        int time = 20;
//        System.out.println((time < 18)? "Good day": "Good evening");


        // nested ternary (optional)

        int time = 9;
        String message = (time < 12) ? "Good day"
                : (time < 18) ? "Good afternoon"
                : "Good evening";
        System.out.println(message);
    }
}
