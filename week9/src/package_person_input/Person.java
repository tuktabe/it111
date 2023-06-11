package package_person_input;

public class Person {
// no main method
// creating our fields
    String name;
    char gender;
    String zipCode;
    int age;
// we have several booleans for our specific violations
    boolean violations;
    boolean violationDUI;
    boolean violationRedLight;
    boolean violationSpeeding;
    double creditScore;
    double baseLineRate = 300;
// now we are going to create a method to display our inputs

public void display() {
        System.out.println("This is the information that you had provided.");
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(zipCode);
        System.out.println("Baseline rate: " +baseLineRate);
        System.out.println("Don't forget that your total rate may change due to violations, age, and credit score");
        System.out.println("Violations: " +violations);
        System.out.println("DUI Violation: " +violationDUI);
        System.out.println("Red Light Violation: " +violationRedLight);
        System.out.println("Speeding Violation: " +violationSpeeding);
        System.out.println("Credit Score: " +creditScore);
    }
// create a method - violations and credit score
// violation or credit score

    public double getRate(double monthlyRate) {
    if(violations == true || creditScore <= 700) {
    monthlyRate = 300.00;
    } else {
    monthlyRate = 0;
    }
    return monthlyRate;
    }
// new method for age
// if you are young or older you will be paying more money

    public double ageCategory(double adjustedRate) {
    if(age <= 25 || age >= 65) {
    adjustedRate = 300.00;
    } else {
    adjustedRate = 0;
    }
    return adjustedRate;
    }
// our method for states/ Zipcodes/ String/ Changing your String to an integer!

    public int identifyRegion(int states) {
// 90 - 96 - ca, 97 - or, 98 and 99
    String zip2;
    zip2 = zipCode.substring(0, 2);
    int cityCode = Integer.parseInt(zip2);

    if(cityCode >= 90 && cityCode < 97) {
    System.out.println("You entered " +zipCode+ " and you're from California");

    } else if (cityCode >= 97 && cityCode < 98) {
    System.out.println("You entered " +zipCode+ " and you're from Oregon");

    } else if (cityCode >= 98 && cityCode <= 99) {
    System.out.println("You entered " +zipCode+ " and you're from Washington");

    } else {
    System.out.println("You're not from the PNW, please contact our National Office");
    }

    return states;
    }

// method to charge a surcharge to people who live in California, because there are so many cars, pollution

   public double californiaRegion(double surcharge) {
       int cityCode = 0;
       if(cityCode >= 90 && cityCode < 97) {
           surcharge = 200;
       } else {
           surcharge = 0;
       }
       return surcharge;
   }



}
