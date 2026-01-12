public class nestedIf {
    public static void main(String[] args){

        // A nested "if" lets you check for a condition only if another condition is already true

        int age = 18;
        boolean isCitizen = false;

        if (age >= 18) {
            System.out.println("Old enough to vote");

            if (isCitizen) {
                System.out.println("You are a citizen and old enough to vote");
            } else {
                System.out.println("But you must be a citizen to vote");
            }
        } else {
            System.out.println("You are too young to vote");
        }
    }
}
