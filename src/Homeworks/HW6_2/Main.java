package Homeworks.HW6_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select a shape: ");
            System.out.println("1. Circle");
            System.out.println("2. Triangle");
            System.out.println("3. Square");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Circle selected
                    Circle circle = new Circle(0);

                    System.out.println("Choose what to calculate:");
                    System.out.println("1. Perimeter");
                    System.out.println("2. Area");
                    int circleChoice = scanner.nextInt();

                    if (circleChoice == 1) {

                        System.out.println("Enter circle radius:");
                        int radius = scanner.nextInt();
                        circle = new Circle(radius);
                        double perimeter = circle.calculatePerimeter();
                        System.out.println("Circle perimeter: " + perimeter);
                    } else if (circleChoice == 2) {

                        System.out.println("Enter circle radius:");
                        int radius = scanner.nextInt();
                        circle = new Circle(radius);
                        double area = circle.calculateArea();
                        System.out.println("Circle area: " + area);
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;

                case 2:

                    Triangle triangle = new Triangle(0, 0, 0);

                    System.out.println("Choose what to calculate:");
                    System.out.println("1. Perimeter");
                    System.out.println("2. Area (using Heron's formula)");
                    System.out.println("3. Area (using base and height)");
                    System.out.println("4. Area (using two sides and an angle)");
                    int triangleChoice = scanner.nextInt();

                    if (triangleChoice == 1) {

                        System.out.println("Enter triangle sides (a, b, c):");
                        int sideA = scanner.nextInt();
                        int sideB = scanner.nextInt();
                        int sideC = scanner.nextInt();
                        triangle = new Triangle(sideA, sideB, sideC);
                        double perimeter = triangle.calculatePerimeter();
                        System.out.println("Triangle perimeter: " + perimeter);

                    } else if (triangleChoice == 2) {

                        System.out.println("Enter triangle sides (a, b, c):");
                        int sideA = scanner.nextInt();
                        int sideB = scanner.nextInt();
                        int sideC = scanner.nextInt();
                        triangle = new Triangle(sideA, sideB, sideC);
                        double area = triangle.calculateArea(sideA, sideB, sideC);
                        System.out.println("Triangle area: " + area);

                    } else if (triangleChoice == 3) {

                        System.out.println("Enter triangle base (a):");
                        int base = scanner.nextInt();
                        System.out.println("Enter triangle height (h):");
                        int height = scanner.nextInt();
                        triangle = new Triangle(base, height);
                        double area = triangle.calculateArea(base, height);
                        System.out.println("Triangle area: " + area);

                    } else if (triangleChoice == 4) {

                        System.out.println("Enter triangle sides (a, b):");
                        int sideA = scanner.nextInt();
                        int sideB = scanner.nextInt();
                        System.out.println("Enter angle (in degrees):");
                        double angle = scanner.nextDouble();
                        triangle = new Triangle(sideA, sideB, angle);
                        double area = triangle.calculateArea(sideA, sideB, angle);
                        System.out.println("Triangle area: " + area);
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;

                case 3:

                    Square square = new Square(0);

                    System.out.println("Choose what to calculate:");
                    System.out.println("1. Perimeter");
                    System.out.println("2. Area");
                    int squareChoice = scanner.nextInt();

                    if (squareChoice == 1) {

                        System.out.println("Enter square side length:");
                        int sideLength = scanner.nextInt();
                        square = new Square(sideLength);
                        double perimeter = square.calculatePerimeter();
                        System.out.println("Square perimeter: " + perimeter);
                    } else if (squareChoice == 2) {
                        // Calculate square area
                        System.out.println("Enter square side length:");
                        int sideLength = scanner.nextInt();
                        square = new Square(sideLength);
                        double area = square.calculateArea();
                        System.out.println("Square area: " + area);
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;

                default:
                    System.out.println("Invalid shape choice.");
            }

            System.out.println("Do you want to calculate another shape? (1 for yes, 0 for no): ");
            int continueChoice = scanner.nextInt();
            if (continueChoice == 0) {
                break;
            }
        }
    }
}
