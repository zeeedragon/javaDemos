package hierarchy;

import java.util.ArrayList;

public class VideoItem extends ProductItem {
    private ArrayList<String> genreTags;

    public VideoItem(String id, double basePrice, double categoryPrice, ArrayList<Publisher> publisher, ArrayList<String> genreTags) {
        super(id, basePrice, categoryPrice, publisher);
        this.genreTags = genreTags;
    }

    public ArrayList<String> getGenreTags() {
        return genreTags;
    }

    public double getCategoryPrice()
    {
        return 20;
    }

    public double getPrice() {

        //get total cost of tax for each publisher for the VIDEO item;
        return  super.getPrice(); //+TOTAL TAX;o
    }

}
