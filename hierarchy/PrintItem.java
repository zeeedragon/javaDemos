package hierarchy;

import java.util.ArrayList;

public class PrintItem extends ProductItem {
    private ArrayList<String> genreTags;
    private ArrayList<String> scientificAreaTags;1

    public PrintItem(String id, double basePrice, double categoryPrice, ArrayList<Publisher> publisher, ArrayList<String> genreTags, ArrayList<String> scientificAreaTags) {
        super(id, basePrice, categoryPrice, publisher);
        this.genreTags = genreTags;
        this.scientificAreaTags = scientificAreaTags;
    }

    public ArrayList<String> getGenreTags() {
        return genreTags;
    }

    public ArrayList<String> getScientificAreaTags() {
        return scientificAreaTags;
    }

    public double getCategoryPrice() {
        return 15;
    }

    public double getPrice() {
        //get total Amount of the DISCOUNT from each publisher for the print item;
        return super.getPrice(); //+discount;
    }
}
