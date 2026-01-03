public class IdentifyString {
    public static void main (String[] args){
        String testString = "This is a test string";

        /*
         Using the startsWith(string prefix) built in method
         It checks to see if a string starts with the given prefix substring
        */

        boolean testStringOutput = testString.startsWith("This"); // true
        boolean testStringOutput2 = testString.startsWith("test"); // false

        /*
         Using endsWith(suffix substring) built in method
         Checking if a string ends with a given suffix substring
        */

        boolean testStringOutput3 = testString.endsWith("string"); // true
        boolean testStringOutput4 = testString.endsWith("test"); // false

        /*
         Using isEmpty() built in method
         Checking to see if a string is empty
        */

        String testStringEmpty = "Hello World";
        String testStringEmpty2 = "";

        boolean testStringOutput5 = testStringEmpty.isEmpty(); // false
        boolean testStringOutput6 = testStringEmpty2.isEmpty(); // true

        /*
         Using the indexOf(string stringToSearchFor) built in method
         Checking the start index of the first occurrence a particular substring
         It returns -1 if the string isn't found
        */

        String  testString2 = "This is java";
        int testStringOutput7 = testString2.indexOf("is");
        int testStringOutput8 = testString2.indexOf("string"); // would return -1
        int testStringOutput9 = testString2.indexOf("java");

        // Creating a new string by removing characters of an original string by specifying the start index number
        String newTextString = "I came from Nigeria";
        String subString = newTextString.substring(7);  // returns "from Nigeria"

        // Removing spaces from a tring where spaces might exist at both ends
        String newTextString2 = " This is java ";

        // Using equalsIgnoreCase() built in method
        // Comparing two strings regardless of their capitalization
        String newTextString3 = "Java";
        String newTextString4 = "jAVa";
        boolean isTheSame = newTextString3.equalsIgnoreCase((newTextString4));

        // Using contains() built in method
        // Checking if a string contains a substring

        String testString3 = "Java";
        boolean containsSubstring = testString.contains(testString3); // false


        String nameString = "Saulgoodman";

        boolean containsString = nameString.contains("good");
        if (containsString){
            System.out.println("You get a gift from Santa");
        } else {
            System.out.println("Next year, please");
        }


        System.out.println(testStringOutput);
        System.out.println(testStringOutput2);
        System.out.println(testStringOutput3);
        System.out.println(testStringOutput4);
        System.out.println(testStringOutput5);
        System.out.println(testStringOutput6);
        System.out.println(testStringOutput7);
        System.out.println(testStringOutput8);
        System.out.println(testStringOutput9);
        System.out.println(subString);
        System.out.println(newTextString2.trim());
        System.out.println(isTheSame);
        System.out.println(containsSubstring);
    }
}
