package hierarchy;

import java.util.ArrayList;
import java.util.TreeMap;

public class MagazineItem extends PrintItem {
    private TreeMap<String, String> articlesAndAuthors;

    public MagazineItem(String id, double basePrice, double categoryPrice, ArrayList<Publisher> publisher, ArrayList<String> genreTags, ArrayList<String> scientificAreaTags, TreeMap<String, String> articlesAndAuthors) {
        super(id, basePrice, categoryPrice, publisher, genreTags, scientificAreaTags);
        this.articlesAndAuthors = articlesAndAuthors;
    }

    public TreeMap<String, String> getArticlesAndAuthors() {
        return articlesAndAuthors;
    }
}
