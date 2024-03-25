package se.lexicon.model;

public interface IOrderItem {

   int MAX_ITEMS = 10;

    void addItems(Product[] items);

    void addItem(Product item);
    void removeItem(Product item);
    Product[] getItems();
    void displayItems();
    double calculateTotal();
    double calculateTotalWithTax();


}
