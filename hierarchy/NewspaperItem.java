package hierarchy;

import java.util.ArrayList;
import java.util.TreeMap;

public class NewspaperItem extends PrintItem {
    private TreeMap<String, TreeMap<String, String>> articlesAndAuthors;

    public NewspaperItem(String id, double basePrice, double categoryPrice, ArrayList<Publisher> publisher, ArrayList<String> genreTags, ArrayList<String> scientificAreaTags, TreeMap<String, TreeMap<String, String>> articlesAndAuthors) {
        super(id, basePrice, categoryPrice, publisher, genreTags, scientificAreaTags);
        this.articlesAndAuthors = articlesAndAuthors;
    }

    public TreeMap<String, TreeMap<String, String>> getArticlesAndAuthors() {
        return articlesAndAuthors;
    }
}
