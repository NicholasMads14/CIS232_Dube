public class Square implements Shape {
    double sideLength;
    double area;
    String color = "Red";

    // Constructor
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void color() {
        System.out.printf("The color of this shape is %s\n", color);
    }

    @Override
    public void calculateArea() {
        area = sideLength * 4;
        System.out.printf("The area of a square with sides of length %.2f is %.2f\n", sideLength, area);
    }
}
