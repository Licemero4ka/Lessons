package Classworks.CW5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //3
         int result = (int) sum(2, 3);
         System.out.println(result);


        //4
        String[] stringArray = {"Helo", "my", "dear", "frieds"};
        String resultstring = appendStrings(stringArray);
        System.out.println(resultstring);


        String string = "Helo my dear frieds";
        String[] a = TextToArray(string);
        System.out.println(Arrays.toString(a));
    }
        //1
        private static void Empty () {
            System.out.println();
        }

        //2
        private static void number ( int a){
            System.out.println();
        }

        //3
        private static float sum ( int a, int b){
            return a + b;
        }

        //4
        private static String appendStrings(String[] strings) {
            String result = strings[0];

            for (int i = 1; i < strings.length; i++) {
                result = result + " " + strings[i];
            }

            return result;
        }

    private static String[] TextToArray(String strings) {

    String[] array = strings.split(" ");

        return array;
    }

    }




