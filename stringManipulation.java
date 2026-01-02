public class stringManipulation {
    public static void main(String[] args) {
        String name1 = "Kene";
        String name2 = "Kene";
        String text = "Subscription";
        String fruit = "Banana";

        // Getting the length of a string
        int nameLength = name1.length();

        // Getting the first character of a string
        char firstChar = name1.charAt(0);

        // Getting a section of the string (it excludes the end-index) string.substring(start, stop-1)
        String partFrom1to4 = name1.substring(1, 4);

        // Getting "script" from "Subscription"
        String extractedText = text.substring(3, 9);

        // Checking if two strings are the same
        boolean isTheSame = name1.equals(text);
        boolean isTheSame2 = name1.equals(name2);

        // Changing all letter of a string to uppercase and lowercase
        String strUpper = name1.toUpperCase();
        String strLower = name2.toLowerCase();

        // Checking if a sequence of characters is present in a string
        boolean textCheck = text.contains("string");
        boolean textCheck2 = text.contains("script");

        // Replacing all occurrences of a character with a new character
        String replacedString = fruit.replace('a', 'o');



        System.out.println("Name has " +nameLength + " characters: " + name1);
        System.out.println("First character of name: " + firstChar);
        System.out.println("1st to 4th character of the string: " + partFrom1to4);
        System.out.println("Extracted Text: " + extractedText);
        System.out.println("Compared Strings: " + isTheSame);
        System.out.println("Compared Strings: " + isTheSame2);
        System.out.println("UpperCase String: " + strUpper);
        System.out.println("LowerCase String: " + strLower);
        System.out.println("Contains subString: " + textCheck);
        System.out.println("Contains subString: " + textCheck2);
        System.out.println("Replaced String: " + replacedString);


    }

}

