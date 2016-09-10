package hierarchy;

import java.util.ArrayList;

public class MusicItem extends ProductItem {
    private ArrayList<String> genre;

    public MusicItem(String id, double basePrice, double categoryPrice, ArrayList<Publisher> publisher, ArrayList<String> genre) {
        super(id, basePrice, categoryPrice, publisher);
        this.genre = genre;
    }

    public ArrayList<String> getGenre() {
        return genre;
    }

    public double getCategoryPrice()
    {
        return 4;
    }

    public double getPrice() {

        //get total cost of tax for each publisher for the MUSIC item;
        return  super.getPrice(); //+TOTAL TAX;
    }
}
