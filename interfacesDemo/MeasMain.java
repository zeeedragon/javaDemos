package interfacesDemo;

//import abstractionDemo.Rectangle;

import java.awt.Rectangle;
import java.util.Arrays;

class RectMeas implements MeasBack {
    public RectMeas() {

    }

    public double measure(Object obj) {
        Rectangle r = (Rectangle) obj;
        return r.getHeight() * r.getWidth();
    }
}

public class MeasMain {

    public static void main(String[] args) {
        Person[] people = new Person[]{new Person(1, 1.75), new Person(2, 1.80), new Person(3, 1.70), new Person(4, 1.85)};

        Country c1 = new Country("BG", 111000);
        Country c2 = new Country("NO", 998000);
        Country c3 = new Country("GB", 465000);

        System.out.println(Data.avg((Measurable[]) people));
        System.out.println(Data.avg(c1, c2, c3));

        Measurable maxMeas = Data.greater(people[0], people[1]);
        if (maxMeas instanceof Person) {
            Person p = (Person) maxMeas;
            System.out.printf("%d - %.2f%n", p.getId(), p.getHeight());
        } else {
            System.out.println("Error");
        }

        Country bigger = (Country) Data.greater(c2, c3);
        System.out.printf("%s - %.2f%n", bigger.getName(), bigger.getArea());

        Country biggest = (Country) Data.max(c1, c2, c3);
        Person tallest = (Person) Data.max(people);

        System.out.printf("%s - %.2f%n", biggest.getName(), biggest.getArea());
        System.out.printf("%s - %.2f%n", tallest.getId(), tallest.getHeight());

        //sorting

        Arrays.sort(people);
        //System.out.println(Arrays.toString(people));

        print(people);

        //for (Person p : people) {
        //    System.out.println("%d - %.2f%n", p.getId(), p.getHeight());
        //}

        Country[] countries = new Country[]{c1, c2, c3};
        Arrays.sort(countries);
        print(countries);

        //finding min = the least tall person
        MeasBack intrf = new Person();
        Person shortest = (Person) Data.min(intrf, (Object[]) people); //cast to Person as min method uses Object

        System.out.println(shortest.getId() + " - " + shortest.getHeight());

        //finding min - the smallest country

        intrf = new Country(); //we are using the same variable for Country
        Country smallest = (Country) Data.min(intrf, (Object[]) countries);
        System.out.println(smallest.getName() + " - " + smallest.getArea());

        //finding rectangle with smallest area
        Rectangle[] rect = new Rectangle[]{new Rectangle(0, 0, 200, 100), new Rectangle(50, 50, 50, 50), new Rectangle(0, 0, 150, 100)};
        intrf= new RectMeas(); //we are using this MeasBack from the separate method
        Rectangle minRect = (Rectangle)Data.min(intrf, rect);
        System.out.println(minRect.getWidth() + " - " + minRect.getHeight());
    }

    public static void print(Measurable... arr) {
        for (Measurable item : arr) {
            System.out.print(item.getMeasure() + " ");
        }
        System.out.println();
    }

    //class for the rectangles
    //this is internal class within the Main
}
