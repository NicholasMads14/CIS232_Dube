import static java.lang.Math.PI;

public class Circle extends Shape {
    double radius;;
    double area;


    public Circle(double radius) {
        this.radius = radius;
    }

    // Methods
    @Override
    public void calculateArea() {
        area = PI * radius * radius;
        System.out.printf("Area of a circle with radius %d: %f", (int) radius, area);
    }
}
