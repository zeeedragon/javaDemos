package interfacesDemo;

class Country implements Measurable, Comparable<Country>, MeasBack{
    private String name;
    private double area;

    public Country(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public Country() {
        name = "test";
        area = 0;
    }

    public double getArea() {
        return area;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getMeasure() {
        return area;
    }

    public int compareTo(Country c) {
        return (int)(this.area - c.getArea());
    }

    public double measure(Object obj) {
        return ((Country) obj).getArea(); //casting Object to Person
    }
}
