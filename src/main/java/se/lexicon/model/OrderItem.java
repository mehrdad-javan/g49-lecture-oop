package se.lexicon.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.UUID;

public class OrderItem implements IOrderItem {

    private final String orderId;
    private final LocalDateTime orderDate;
    private Product[] items;

    public OrderItem() {
        this.orderId = UUID.randomUUID().toString();
        this.orderDate = LocalDateTime.now();
        this.items = new Product[0];
    }

    @Override
    public void addItems(Product[] items) {

    }

    @Override
    public void addItem(Product item) {
        Product[] newItems = new Product[items.length + 1];
        System.arraycopy(items, 0, newItems, 0, items.length);
        newItems[newItems.length - 1] = item;
        items = newItems;
    }

    @Override
    public void removeItem(Product item) {
        // todo: needs completions
    }

    @Override
    public Product[] getItems() {
        return Arrays.copyOf(items, items.length);
    }

    @Override
    public void displayItems() {
        int counter = 1;
        for (Product item : items) {
            System.out.println("ORDER[" + counter++ + "]------------");
            System.out.println(item.getDescription());
        }
        System.out.println("#########################");
        System.out.println("TOTAL ORDER Cost: " + calculateTotal());
        System.out.println("TOTAL ORDER Cost with Tax: " + calculateTotalWithTax());
        System.out.println("#########################");

    }

    @Override
    public double calculateTotal() {
        double total = 0;
        for (Product item : items) {
            total = total + item.getPrice();
        }
        return total;
    }

    @Override
    public double calculateTotalWithTax() {
        // todo: needs completions
        return 0;
    }

    public int getMaxItemNumber() {
        return MAX_ITEMS;
    }

}
