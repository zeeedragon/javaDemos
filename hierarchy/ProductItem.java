package hierarchy;

import java.util.ArrayList;

public class ProductItem extends OnlineItem {
    private double basePrice;
    private double categoryPrice;
    private ArrayList<Publisher> publisher;

    public ProductItem(String id, double basePrice, double categoryPrice, ArrayList<Publisher> publisher) {
        super(id);
        this.basePrice = basePrice;
        this.categoryPrice = categoryPrice;
        this.publisher = publisher;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getPrice() {
       return basePrice + getCategoryPrice();
    }

    public ArrayList<Publisher> getPublisher() {
        return publisher;
    }

    public double getCategoryPrice()
    {
        return 0;
    }
}
