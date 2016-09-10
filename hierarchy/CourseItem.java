package hierarchy;


import java.util.ArrayList;

public class CourseItem extends ProductItem {

    private ScientificSection scientificSection;

    public CourseItem(String id, double basePrice, double categoryPrice, ArrayList<Publisher> publisher, ScientificSection scientificSection) {
        super(id, basePrice, categoryPrice, publisher);
        this.scientificSection = scientificSection;
    }

    public ScientificSection getScientificSection() {
        return scientificSection;
    }

    public double getCategoryPrice() {
        return 30;
    }

}
