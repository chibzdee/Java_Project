public class LogicalOperators {
    public static void main(String[] args){
//        boolean isColdOutside = true;
//        boolean haveWorkToday = false;
//        boolean isWeekend = true;
//
//        if (isColdOutside && haveWorkToday && isWeekend){
//            System.out.println("Go to work today!! ");
//        } else{
//            System.out.println("No work today");
//        }

        // real life example

        boolean isLoggedIn = true;
        boolean isAdmin = false;
        int securityLevel = 3; // where 1 is the highest

        if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Access Denied");
        }
    }
}
