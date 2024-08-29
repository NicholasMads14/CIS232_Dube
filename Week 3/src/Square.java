public class Square extends Shape {
    double sideLength;
    double area;

    // Constructor
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void calculateArea() {
        area = sideLength * 4;
    }
}
