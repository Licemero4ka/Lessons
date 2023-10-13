package Homeworks.HW4;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void info() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public static void main(String[] args) {

        Point[] points = new Point[4];
        points[0] = new Point(1, 2);
        points[1] = new Point(3, 4);
        points[2] = new Point(6, 8);
        points[3] = new Point(5, 7);

        System.out.println("All Points:");
        for (Point point : points) {
            point.info();
        }
        System.out.println("Points with x and y coordinates that are multiples of 2:");
        for (Point point : points) {
        if(point.getX()% 2 == 0 && point.getY()% 2 ==0)
            point.info();
        }

        }
    }


