package se.lexicon.model;

public final class Burger extends Product {

    private final String type;
    private final boolean hasCheese;

    public Burger(String name, double price, String type, boolean hasCheese) {
        super(name, price);
        this.type = type;
        this.hasCheese = hasCheese;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Type: " + type + ", Cheese: " + hasCheese;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "type='" + type + '\'' +
                ", hasCheese=" + hasCheese +
                '}';
    }

    @Override
    public double calculateTax(){
        return getPrice() * 0.1;
    }
}
