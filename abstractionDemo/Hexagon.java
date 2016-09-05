package abstractionDemo;

public class Hexagon extends Shape {
    private double side;

    public Hexagon(double side) {
        super(6);
        this.side = side;
    }

    @Override
    public double perim() {
        return 6 * side;
    }

    @Override
    public double area() {
        return Math.sqrt(3) * 3 / 2 * side * side;
    }
}
