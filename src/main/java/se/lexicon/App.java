package se.lexicon;

import se.lexicon.model.Car;
import se.lexicon.model.Person;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //Car car = new Car(); // regNum: 1234fdf, brand: null, model: null year: 0

        Car car1 = new Car("VOLVO", "V60"); // regNum: null, brand: Volvo, model: V60, year: 0
        Car car2 = new Car("VOLVO", "V40", 2020);

        Person person1 = new Person("John Doe", "123456789", "123 Main St");
        Person person2 = new Person("Simon Elbrink", "987654321", "222 Main St");

        person1.registerCarOwnership(car1);
        person1.registerCarOwnership(car2);

        car1.displayInfo();
        car2.displayInfo();
        System.out.println("-------------");
        person1.displayInfo();
        person2.displayInfo();





    }
}
