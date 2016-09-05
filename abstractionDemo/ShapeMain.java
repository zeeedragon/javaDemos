package abstractionDemo;

import java.util.ArrayList;
import java.util.Scanner;

import static sun.misc.Version.print;

public class ShapeMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Shape> objects = new ArrayList<Shape>();
        int count = in.nextInt();

        while (count != 0) {
            Shape fig = createFig(count, in); //creating the fig
            objects.add(fig);
            count = in.nextInt();
        }
        double height = in.nextDouble();

        print(objects, height);
    }

    public static Shape createFig(int c, Scanner in) {
        double s1, s2, s3;
        switch (c) {
            case 3: {
                s1 = in.nextDouble();
                s2 = in.nextDouble();
                s3 = in.nextDouble();
                return new Triangle(s1, s2, s3);
            }
            case 4: {
                s1 = in.nextDouble();
                s2 = in.nextDouble();
                return new Rectangle(s1, s2);
            }
            case 6: {
                s1 = in.nextDouble();
                return new Hexagon(s1);
            }

            default: {
                return null;
            }
        }
    }

    public static void print(ArrayList<Shape> shapes, double height) {
        int countSides = 0;
        double totalPerimeter = 0;
        double totalVolume = 0;
        for (Shape c : shapes) {
            if (c != null) {
                countSides += c.getSides();
                totalPerimeter += c.perim();
                totalVolume += c.area() * height;
            }
        }
        System.out.printf(countSides + "%n" + totalPerimeter + "%n" + totalVolume);
    }
}
