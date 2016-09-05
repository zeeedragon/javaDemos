package abstractionDemo;

public abstract class Shape {
        private int sides;

        public Shape(int sides) {
            this.sides = sides;
        }

        public int getSides() {
            return sides;
        }

        public abstract double perim();

        public abstract double area();

}
