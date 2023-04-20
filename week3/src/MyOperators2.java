public class MyOperators2 {

    public static void main(String[] args) {

//      boolean operators

//        boolean tuna = true;
//        boolean bread = true;
//        if(tuna == true && bread == true) {
//            System.out.println("We are having a sandwich!");
//        } else {
//            System.out.println("We are not!");
//        }

        boolean tuna = false;
        boolean bread = true;
        if(tuna == true || bread == true) {
            System.out.println("We are having some food products");
        } else {
            System.out.println("We will not be eating any food products today!");
        }

        // age - drinking age!

        int age = 18;

        if(age >= 18) {
            System.out.println("Yippy skippy, we can order an adult beverage!");
        } else {
            System.out.println("We will have a diet coke");
        }

        // amusement park roller coaster rider - smaller than 4 feet

        float height = 4f;

        if(height < 4) {
            System.out.println("You will not be able to ride the roller coaster");
        } else {
            System.out.println("Have a great time on the roller coaster");
        }







    }
}
