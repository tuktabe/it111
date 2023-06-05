package package_person_homework;

public class PersonDetails {

public static void main(String[] args) {

    Person firstPerson;
    Person secondPerson;

    firstPerson = new Person();
    secondPerson = new Person();

    firstPerson.name = "Cathy Jones";
    firstPerson.age = 33;
    firstPerson.carYear = 2015;
    firstPerson.violations = false;
    firstPerson.creditScore = 680;

    secondPerson.name = "Kendall Black";
    secondPerson.age = 22;
    secondPerson.carYear = 2022;
    secondPerson.violations = true;
    secondPerson.creditScore = 690;

    double monthlyRate = 0;
    double carDiscount = 0;

    firstPerson.display();
    System.out.println(firstPerson.getRate(monthlyRate) +firstPerson.adjustRateFromCar(carDiscount));
    System.out.println();

    secondPerson.display();
    System.out.println(secondPerson.getRate(monthlyRate) +secondPerson.adjustRateFromCar(carDiscount));
    System.out.println();

    }
}
