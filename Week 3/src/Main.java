import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Is your shape a circle or square?");
        String type = scanner.nextLine();

        if ("circle".equals(type)) {
            // Creates new Circle object
            Circle c = new Circle(0);
            // Asks user for radius
            System.out.println("What is the radius? ");
            c.radius = scanner.nextInt();
            // calculates and displays area
            c.calculateArea();
            c.color();

        } else if ("square".equals(type)) {
            // Creates new Square object
            Square s = new Square(0);
            // Asks user for side length
            System.out.println("What is the side length? ");
            s.sideLength = scanner.nextInt();
            // calculates and displays area
            s.calculateArea();
            s.color();

        } else {
            System.out.println("You did not input a correct option.");
        }
    }
}