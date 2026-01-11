public class TypeCasting {
    public static void main(String[] args){

        /*
         Type casting means converting one data type into another
         There are two main types of casting:

         Widening Casting (automatic): converting a smaller type to a larger type
                byte -> short -> char -> int -> long -> float -> double

         Narrowing Casting (manual): converting a large type to a smaller type
                double -> float -> long -> int -> char -> short -> byte
        */

        // Widening casting
        int myInt = 9;
        double myDouble = myInt; // converts int to double 9 -> 9.0
        System.out.println(myDouble);



        /*
         Narrowing casting
         This must be done manually by placing the type in parenthesis () in front of the value
         This is required because narrowing might result in data loss
        */

        double testDouble = 76.83;
        double testInt = (int) testDouble;  // converts double to int 76.83 -> 76
        System.out.println(testInt);



    }
}
