package hierarchy;

import java.util.ArrayList;

public class ServiceItem extends OnlineItem {
    private ArrayList<String> categoryTags;
    private Double hourlyRate;
    private Double specialTax;

    public ServiceItem(String id, ArrayList<String> categoryTags, Double hourlyRate, Double specialTax) {
        super(id);
        this.categoryTags = categoryTags;
        this.hourlyRate = hourlyRate;
        this.specialTax = specialTax;
    }

    public ArrayList<String> getCategoryTags() {
        return categoryTags;
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public Double getSpecialTax() {
        return specialTax;
    }
}
