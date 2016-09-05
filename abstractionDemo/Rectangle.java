package abstractionDemo;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super(4);
        this.length = length;
        this.width = width;
    }

    @Override
    public double perim() {
        return 2 * (length + width);
    }

    @Override
    public double area() {
        return length * width;
    }
}

