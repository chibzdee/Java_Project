import java.lang.reflect.Array;
import java.util.ArrayList;

public class varKeyword {
    public static void main(String[] args){
        var myVar = 26;
        System.out.println(((Object)myVar).getClass()); // checking for data type using the var keyword


        int myInt = 28;
        System.out.println(((Object)myInt).getClass());  // checking the data type of a primitive datatype

        // For simple variables, its is usually clearer to write the type directly (int, bool, string)
        // But for complex types like Array or HashMap, var can make the code shorter and easier to read

        // Without var
        ArrayList<String> cars = new ArrayList<String>();

        // With var
        var car = new ArrayList<String>();

        System.out.println(cars);  // Returns an empty list
    }
}

