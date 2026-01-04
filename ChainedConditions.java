public class ChainedConditions {
    public static void main(String[] args){
        int numberChecked = 1;

        if (numberChecked >= 5){
            System.out.println("Number " +numberChecked + " >= 5" );
        }
        else{
            System.out.println("Number " +numberChecked +" < 5");
        }
    }
}
