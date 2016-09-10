package hierarchy;

public class Publisher {
    public enum typeOfPublishers { PRINTING, ENTERTAINMENT, EDUCATION};

    private typeOfPublishers publisherType; //for print, games, etc.
    private double tax;
    private double discount;

    public Publisher(typeOfPublishers publisherType, double tax, double discount) {
        this.publisherType = publisherType;
        this.tax = tax;
        this.discount = discount;
    }

    public typeOfPublishers getPublisherType() {
        return publisherType;
    }

    public double getDiscount() {
        return discount;
    }

    public double getTax() {
        return tax;
    }
}
