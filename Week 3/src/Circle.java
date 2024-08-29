import static java.lang.Math.PI;

public class Circle extends Shape {
    double radius;;
    double area;
    String color = "Green";

    public Circle(double radius) {
        this.radius = radius;
    }

    // Methods
    @Override
    public void color() {
        System.out.printf("The color of this shape is %s\n", color);
    }

    @Override
    public void calculateArea() {
        area = PI * radius * radius;
        System.out.printf("The area of a circle with radius %d is %.2f\n", (int) radius, area);
    }
}
