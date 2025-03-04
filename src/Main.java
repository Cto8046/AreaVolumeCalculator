import java.util.Scanner;

/**
 * Program to calculate the area of a rectangle and the volume of different shapes.
 * User inputs values, and the program does the math.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for rectangle dimensions and calculate area
        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the rectangle:");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());

        // Ask the user which shape's volume to calculate
        System.out.println("Choose a shape to calculate volume (1: Cube, 2: Cylinder, 3: Sphere):");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Enter the side length of the cube:");
            double side = scanner.nextDouble();
            Cube cube = new Cube(side);
            System.out.println("Cube Volume: " + cube.calculateVolume());
        } else if (choice == 2) {
            System.out.println("Enter the radius of the cylinder:");
            double radius = scanner.nextDouble();
            System.out.println("Enter the height of the cylinder:");
            double height = scanner.nextDouble();
            Cylinder cylinder = new Cylinder(radius, height);
            System.out.println("Cylinder Volume: " + cylinder.calculateVolume());
        } else if (choice == 3) {
            System.out.println("Enter the radius of the sphere:");
            double radius = scanner.nextDouble();
            Sphere sphere = new Sphere(radius);
            System.out.println("Sphere Volume: " + sphere.calculateVolume());
        } else {
            System.out.println("Invalid choice, please try again.");
        }

        scanner.close();
    }
}

// Class to calculate rectangle area
class Rectangle {
    double length;
    double width;

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double calculateArea() {
        return length * width;
    }
}

// Class to calculate cube volume
class Cube {
    double side;

    public Cube(double s) {
        side = s;
    }

    public double calculateVolume() {
        return side * side * side;
    }
}

// Class to calculate cylinder volume
class Cylinder {
    double radius;
    double height;

    public Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    public double calculateVolume() {
        return 3.14 * radius * radius * height;
    }
}

// Class to calculate sphere volume
class Sphere {
    double radius;

    public Sphere(double r) {
        radius = r;
    }

    public double calculateVolume() {
        return (4.0 / 3.0) * 3.14 * radius * radius * radius;
    }
}
