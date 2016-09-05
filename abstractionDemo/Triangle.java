package abstractionDemo;


public class Triangle extends Shape {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        super(3);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public boolean exist() {
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }

    @Override
    public double perim() {
        return side1 + side2 + side3;
    }

    @Override
    public double area() {
        double p = (side1 + side2 + side3) / 2;
        if (exist()) {
            return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        } else {
            return 0;
        }
    }
}


