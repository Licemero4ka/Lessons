package Homeworks.HW3;
import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.print("Insert array elements:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.println ("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]);
        }
        int max = getMax(array);
        System.out.println('\n' + "Maximum Value is: "+max);


        int min = getMin(array);
        System.out.println("Minimum Value is: "+min);
    }

    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){ if(inputArray[i] > maxValue){
            maxValue = inputArray[i];
        }
        }
        return maxValue;
    }
    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;

    }
}
