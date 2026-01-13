public class doWhile {
    public static void main(String[] args) {

        // The do/while loop is a variant of the while loop
        // This loop will execute the code block once, before checking if the condition is true
        // Then it will repeat for as long as the condition is true

        int i = 10;

        do {
            System.out.println("i is " + i);
            i++;
        } while (i < 5);
    }
}
