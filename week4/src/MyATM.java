public class MyATM {

    public static void main(String[] args) {

        int withdrawal, amount;
        withdrawal = 40;
        amount = 200;

        while (amount != 0) {
            amount -= withdrawal;
//        amount = amount - withdrawal;
//        System.out.println("Your present amount after the withdrawal is " +amount+ " dollars");

            if (amount == 0) {
                System.out.println("You have no money!!!");
            } else {
                System.out.println("Your present amount after the withdrawal is " + amount + " dollars");
            }
        } // end while loop
    }
}