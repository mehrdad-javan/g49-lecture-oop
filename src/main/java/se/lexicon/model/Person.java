package se.lexicon.model;

import java.util.Arrays;

public class Person {

    // fields
    private String name;
    private String phoneNumber;
    private String email;
    private String address;

    private Car[] carsOwned;

    // constructors
    public Person(String name, String phoneNumber, String address) {
        setName(name);
        setPhoneNumber(phoneNumber);
        setAddress(address);
        this.carsOwned = new Car[0];
    }

    public Person(String name, String phoneNumber, String email, String address) {
        this(name, phoneNumber, address);
        setEmail(email);
    }

    //public Person(){}

    // methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        // todo: add validation as needed
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        // todo: add validation as needed
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        // todo: add validation as needed
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        // todo: add validation as needed
        this.address = address;
    }

    public void registerCarOwnership(Car car){
       carsOwned = Arrays.copyOf(carsOwned, carsOwned.length + 1);
       carsOwned[carsOwned.length - 1] = car;
       car.setOwner(this);
    }

    public void unregisterCarOwnerShip(Car car){
       // todo: needs completion
    }


    public void displayInfo() {
        System.out.print("PersonInfo-> Name: " + name + ", PhoneNumber: " + phoneNumber + ", Email:" + email + " NumberOfOwnedCars: " + carsOwned.length + "\n");

    }

}
