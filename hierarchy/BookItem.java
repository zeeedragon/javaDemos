package hierarchy;

import java.util.ArrayList;

public class BookItem extends PrintItem {
    private String author;

    public BookItem(String id, double basePrice, double categoryPrice, ArrayList<Publisher> publisher, ArrayList<String> genreTags, ArrayList<String> scientificAreaTags, String author) {
        super(id, basePrice, categoryPrice, publisher, genreTags, scientificAreaTags);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
