package se.lexicon;

import se.lexicon.model.*;

public class App {

    public static void main(String[] args) {
        Fries largeFries = new Fries(Size.LARGE, true, false);
        Fries defaultSmallFries = new Fries();
        Burger cheeseBurger = new Burger("Cheese Burger", 100, "CheeseBurger", true);

       // how to call addItem method of OrderItem  class ->  ?
        OrderItem orderItem = new OrderItem();
        orderItem.addItem(largeFries);
        orderItem.addItem(defaultSmallFries);
        orderItem.addItem(cheeseBurger);

        orderItem.displayItems();

    }
}
