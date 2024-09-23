package se.oscar.toString;

public class Main {
    public static void main(String[] args) {
        Apartment apartment = new Apartment("Stenvägen 35", 3, 1700);
        Apartment apartment1 = new Apartment("Kovägen 12", 1, 5000);

        Car car = new Car("Toyota", "420BW", 2019);
        Car car1 = new Car("BMW", "A-Serie", 2020);

        Person person = new Person("Oscar", 23);
        Person person1 = new Person("Gandalf", 23430);
        person.setApartment(apartment);
        person1.setApartment(apartment1);

        System.out.println(apartment);
        System.out.println(apartment1);
        System.out.println(car);
        System.out.println(car);
        System.out.println(person);
        System.out.println(person1);
    }
}
