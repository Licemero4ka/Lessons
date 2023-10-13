package Homeworks.HW5;

public class SumOfDigits {
    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int input = 25;
        int result = sumOfDigits(input);
        System.out.println("The sum is " + result);
    }

}




