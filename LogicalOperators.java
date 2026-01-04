public class LogicalOperators {
    public static void main(String[] args){
        boolean isColdOutside = true;
        boolean haveWorkToday = false;
        boolean isWeekend = true;

        if (isColdOutside && haveWorkToday && isWeekend){
            System.out.println("Go to work today!! ");
        } else{
            System.out.println("No work today");
        }
    }
}
