package Homeworks.HW6_2;

public class Triangle extends Figure{
    private int sideA;
    private int sideB;

    private int sideC;
    private double angle;
    private int hieght;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle(int sideA, int sideB, double angle) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.angle = angle;
    }

    public Triangle(int sideA, int hieght) {
        this.sideA = sideA;
        this.hieght = hieght;
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
        double s = (sideA + sideA + sideA) / 2.0;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    double calculateArea(int sideA, int hieght) {
        return 0.5 * sideA * hieght;
    }

    double calculateArea(int sideA, int sideB, double angle) {
        return 0.5 * sideA * sideB * Math.sin(Math.toRadians(angle));
    }


}
