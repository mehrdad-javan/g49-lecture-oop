package se.lexicon.model;

public abstract class Product extends Object {
    private String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        if (name == null) throw new IllegalArgumentException("Name is null");
        this.name = name;
    }

    public String getDescription() {
        return "Item: " + name + ", Price: SEK " + price;
    }


    public abstract double calculateTax();

}
