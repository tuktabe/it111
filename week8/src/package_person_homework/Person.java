package package_person_homework;

public class Person {
    String name;
    int age;
    int carYear;
    final int thisYear = 2023;
    boolean violations;
    double creditScore;

    public void display() {
    System.out.println("Your name: " +name);
    System.out.println("Your age: " +age);
    System.out.println("Your car: " +carYear);
    System.out.println("Your violations: " +violations);
    System.out.println("Your credit score: " +creditScore);
    }

    public double getRate(double monthlyRate) {
    if (violations == true && creditScore <= 700) {
    monthlyRate = 500.00;
    } else {
    monthlyRate = 100.00;
    }
    return monthlyRate;
    }

    public double adjustRateFromCar(double discount) {
    // if car is older than 5 years then discount
    int age = thisYear-carYear;
    if (age > 5) {
    discount = -75;
    } else {
    discount = 0;
    }
    return discount;
    }

}
