package Homeworks.HW6_2;

public class Triangle extends Figure{
    private final int sideA;
    private final int sideB;
    private final int sideC;


    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    double calculateArea() {
        return 0;
    }

    double calculateArea(int sideA, int sideB, int sideC) {
        double semiPerimeter = (sideA + sideA + sideA) / 2.0;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
    }

    double calculateArea(int sideA, int hieght) {
        return 0.5 * sideA * hieght;
    }

    double calculateArea(int sideA, int sideB, double angle) {
        return 0.5 * sideA * sideB * Math.sin(Math.toRadians(angle));
    }


}
