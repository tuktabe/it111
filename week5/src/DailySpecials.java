import java.util.Scanner;

public class DailySpecials {

    public static void main(String[] args) {

        String specials;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!");

specials = input.next();

//input.close();
// in the world of coffee, I need a name of coffee beverage and a price

        String coffee = "";
        double price=0, total;
        int quantity;

        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");

        if (saturday || sunday) {
            System.out.println("Please enter a weekday, not a weekend!");
            specials = input.next();
        }


        switch (specials) {

            // my cases will be the day of the week
            case "Monday" -> {
                coffee = "Latte";
                price = 4.95;
//              System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
            }

            case "Tuesday" -> {
                coffee = "Frappe";
                price = 5.95;
//              System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                }

            case "Wednesday" -> {
                coffee = "Cappuccino";
                price = 4.35;
//              System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                }

            case "Thursday" -> {
                coffee = "Regular Joe";
                price = 2.95;
//              System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                }

            case "Friday" -> {
                coffee = "Green Tea Latte";
                price = 6.95;
//              System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                }

            default -> System.out.println("Problem!!!");
            }

        System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
        System.out.println("How many " + coffee + " would you like to order?");
        quantity = Integer.parseInt(input.next());
        total = quantity * price;
        switch (quantity){
            case 0 -> {
                System.out.println("Look like you don't like " + coffee + "! So sad!!!");
            }
            case 1 -> {
                System.out.println("Look like you will be ordering only 1 " + coffee + " today!");
            }
            default -> {
                System.out.print(" " + quantity + " "+ coffee + " have been ordered totalling ");
                System.out.printf("$%.2f dollars!", total);
                System.out.println();
            }
        }

        }
    }

