package Homeworks.HW5;

public class NumberOFfibonacciSeries {
    private static int getNumberOfFibonacciSeries(int n) {
        if (n <= 1) {
            return n;
        }

        int n1 = 0;
        int n2 = 1;
        int result = 0;

        for (int i = 3; i <= n; i++) {
            result = n1 + n2;
            n1 = n2;
            n2 = result;
        }
        return result;
    }
    public static void main(String[] args) {
        int input = 12;
        int result = getNumberOfFibonacciSeries(input);
        System.out.println("The " + input + "-th Fibonacci number is " + result);
    }
}
