package se.lexicon;

import java.time.LocalDate;
import java.util.UUID;

public class Car {

    // Fields
    // model, color, year, regNumber, brand, gearBox, country, fulType, and more
    private String registrationNumber; // null
    private String brand;  // null
    private String model; // null
    private int year; // 0

    // Constructors
    public Car(String brand, String model) {
        setBrand(brand);
        setModel(model);
        this.year = LocalDate.now().getYear();
        this.registrationNumber = generateRegistrationNumber();
    }

    // Methods
    public void setBrand(String brand) { // VOLVO
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Brand cannot be null or empty.");
        }
        this.brand = brand;  // VOLVO
    }

    public void setModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Model cannot be null or empty.");
        }
        this.model = model;
    }

    public String getBrand() {
        return this.brand;
    }


    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void displayInfo() {
        System.out.print("Car Info: Registration Number: " + registrationNumber + ", Brand: " + brand + ", Model: " + model + ", Year: " + year + "\n");
    }

    private String generateRegistrationNumber() {
        return UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }

}
