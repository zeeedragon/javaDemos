package hierarchy;

import java.util.ArrayList;

public class GameItem extends ProductItem {
    private ArrayList<String> genreTags;

    public GameItem(String id, double basePrice, double categoryPrice, ArrayList<Publisher> publisher, ArrayList<String> genreTags) {
        super(id, basePrice, categoryPrice, publisher);
        this.genreTags = genreTags;
    }

    public ArrayList<String> getGenreTags() {
        return genreTags;
    }

    public double getCategoryPrice()
    {
        return 12;
    }


    public double getPrice() {

        //get total cost of tax for each publisher for the GAME item;
        return  super.getPrice(); //+TOTAL TAX;
    }

}
