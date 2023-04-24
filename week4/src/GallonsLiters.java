public class GallonsLiters {

    public static void main(String[] args) {
        // lit = (gallon * 3.79)
     String gallon_label;
     double liters, gallon;
     int counter;
     counter = 1;


     for (gallon = 1; gallon <= 100; gallon = gallon + 4) {
         liters = (gallon * 3.79);
         if(gallon == 1){
             gallon_label=" Gallon";
         } else {
             gallon_label=" Gallons";
         }
         System.out.printf("%.2f", liters);
         System.out.println(" Liters = " + gallon + gallon_label);
         if(counter == 5){
             System.out.println();
             counter=0;
         }
         counter++;  //counter=counter+1

         }
        System.out.println("We are done!!!!");
}
}