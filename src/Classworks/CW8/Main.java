package Classworks.CW8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        LinkedList<String> list1 = new LinkedList<>();

        list.add("Sun");
        list.add("mercury");
        list.add("venus");
        list.add("earth");
        list1.add("mars");
        list1.add("jupiter");
        list1.add("saturn");
        list1.add("uranus");
        list1.add("neptune");


        System.out.println(list);
        //removeElement(list);
        System.out.println(list1);
        CompareTo(list1, list);
    }

    private static void removeElement(LinkedList<String> list){

        System.out.println(list.removeLast());
        System.out.println(list.removeFirst());

    }

    private static void CompareTo(LinkedList<String> list1, LinkedList<String> list) {
        System.out.println(Collections.disjoint(list, list1));
    }

}
