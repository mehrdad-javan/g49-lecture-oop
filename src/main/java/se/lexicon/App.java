package se.lexicon;

import se.lexicon.model.Burger;
import se.lexicon.model.Fries;
import se.lexicon.model.Product;
import se.lexicon.model.Size;

public class App {

    public static void main(String[] args) {
        Fries largeFries = new Fries(Size.LARGE, true, false);
        Fries defaultSmallFries = new Fries();
        Burger cheeseBurger = new Burger("Cheese Burger", 100, "CheeseBurger", true);

        System.out.println("largeFries = " + largeFries);
        System.out.println("defaultSmallFries = " + defaultSmallFries);
        System.out.println("cheeseBurger = " + cheeseBurger);

    }
}
