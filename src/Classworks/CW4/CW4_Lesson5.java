package Classworks.CW4;

import java.util.Scanner;

public class CW4_Lesson5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1));
            array[i] = in.nextInt();
        }

        int sum = 1;
        for (int number : array) {
            sum *= number;
        }

        System.out.println(sum);
    }
}