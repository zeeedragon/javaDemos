package interfacesDemo;

public class Person implements Comparable, MeasBack, Measurable {
    private int id;
    private double height;

    public Person(int id, double height) {
        this.id = id;
        this.height = height;
    }

    //default constructors
    public Person() {
        id = 0;
        height = 0;
    }

    public double getHeight() {
        return height;
    }

    public int getId() {
        return id;
    }

    @Override
    public double getMeasure() {
        return height;
    }

    public int compareTo(Object obj) {
        //casting the object to a Person
        Person objPer = (Person) obj;
        if (this.height < objPer.height) {
            return -1;
        }
        if (this.height > objPer.height) {
            return 1;
        }
        return  0;
    }

    public double measure(Object obj) {
        return ((Person) obj).getHeight(); //casting Object to Person;
    }
}
