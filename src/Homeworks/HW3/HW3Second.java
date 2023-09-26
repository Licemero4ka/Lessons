package Homeworks.HW3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HW3Second {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int A[] = new int[size];
        System.out.print("Insert array elements:");

        for (int i = 0; i < size; i++) {
            A[i] = input.nextInt();
        }
        System.out.println ("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + A[i]);
        }

        List<Integer> ints = Arrays.stream(A)
                .boxed()
                .collect(Collectors.toList());

        System.out.println('\n' + "Min element is " + Collections.min(ints));
        System.out.println("Max element is " + Collections.max(ints));
    }
}

