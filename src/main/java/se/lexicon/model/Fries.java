package se.lexicon.model;

public final class Fries extends Product {

    private Size size;
    private boolean isSpicy; // false
    private boolean isSweetPotato; // false

    public Fries(Size size, boolean isSpicy, boolean isSweetPotato) {
        super(size.getName(), size.getPrice());
        this.size = size;
        this.isSpicy = isSpicy;
        this.isSweetPotato = isSweetPotato;
    }


    public Fries() {
        super(Size.SMALL.getName(), Size.SMALL.getPrice());
        this.size = Size.SMALL;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Spicy: " + isSpicy + ", Sweet Potato: " + isSweetPotato;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.2;
    }

    @Override
    public String toString() {
        return "{ " + "Name: " + getName() + ", Price: " + getPrice() + ", SweetPotato: " + isSweetPotato + " }";
    }


}
