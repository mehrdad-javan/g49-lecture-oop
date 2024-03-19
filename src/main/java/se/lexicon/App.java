package se.lexicon;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Car car1 = new Car("VOLVO", "V60"); // regNum: null, brand: Volvo, model: V60, year: 0
        car1.setBrand("V-60");
        car1.displayInfo();


    }
}
