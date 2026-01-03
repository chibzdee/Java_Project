public class CaseSensitiveComparisons {
    public static void main (String[] args){

        String string1 = "Java";
        String string2 = "JAVA";

        // compareTo() --> Case sensitive comparison
        // compares strings character by character

        int stringComparison1 = string1.compareTo(string2); // returns an integer value

        // compareToIgnoreCase() --> Case insensitive comparison
        // converts both strings to the same case before comparing

        int stringComparison2 = string1.compareToIgnoreCase(string2);

        System.out.println("compareTo result: " +stringComparison1);
        System.out.println("compareToIgnoreCase result: " +stringComparison2);
    }
}
