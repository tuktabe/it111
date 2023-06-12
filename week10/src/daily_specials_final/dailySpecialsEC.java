package daily_specials_final;

import java.util.Scanner;

public class dailySpecialsEC {


public static void main(String[] args) {


        String specials = "";
        Scanner input = new Scanner(System.in);

        String coffee = "";
        double price = 0, total, discount;
        int quantity;
        boolean weekend = true;

        while (weekend) {
        System.out.println("Please enter a weekday, excluding weekends");
        specials = input.next();

        weekend = false;

        switch (specials) {
        case "Monday" -> {
        coffee = "Latte";
        price = 4.95;
        }

        case "Tuesday" -> {
        coffee = "Frappe";
        price = 5.95;
        }

        case "Wednesday" -> {
        coffee = "Cappuccino";
        price = 4.35;
        }

        case "Thursday" -> {
        coffee = "Regular Joe";
        price = 2.95;
        }

        case "Friday" -> {
        coffee = "Green Tea Latte";
        price = 6.95;
        }

        default -> weekend = true;
        }

        }

        System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
        System.out.println("How many " + coffee + "s would you like to order?");
        quantity = Integer.parseInt(input.next());

        total = quantity * price;

        if (quantity == 0){
        discount = 0;
        System.out.println("Look like you don't like " + coffee + "! So sad!!!");

        } else if (quantity == 1){
        discount = 0;
        System.out.print("Look like you will be ordering only 1 " + coffee + " today totalling ");
        System.out.printf("$%.2f dollars!", total);
        System.out.println();

        } else if (quantity >= 2 && quantity <= 4){
        discount = 0;
        System.out.print(""+ quantity + " " + coffee + "s have been ordered totalling ");
        System.out.printf("$%.2f dollars", total);
        System.out.println();

        } else if (quantity >= 5 && quantity <= 9){
        discount = 0.1;
        System.out.print("Looks like you qualify for a group discount! Your regular price is ");
        System.out.printf("$%.2f dollars", total);
        System.out.println();
        total = total - (total * discount);
        System.out.print("You have ordered " + quantity + " " + coffee + "s but will only be charged ");
        System.out.printf("$%.2f dollars", total);
        System.out.println();

        } else if (quantity >= 10){
        discount = 0.2;
        System.out.print("A bigger group discount! Your regular price is ");
        System.out.printf("$%.2f dollars", total);
        System.out.println();
        total = total - (total * discount);
        System.out.print("You have ordered " + quantity + " " + coffee + "s but will be only charged ");
        System.out.printf("$%.2f dollars", total);
        System.out.println();
        }

    }
}





