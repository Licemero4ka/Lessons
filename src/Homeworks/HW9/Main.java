package Homeworks.HW9;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(5);
        list.add(10);
        list.add(15);

        System.out.println("Size of the list: " + list.size());

        System.out.println("Index of 10: " +  list.indexOf(10));

        System.out.println(list.isEmpty());

        System.out.println("Contains 20: " + list.contains(20));

        list.add(25, 1);
        System.out.println("Element at index 1: " + list.get(1));

        list.add(30);
        System.out.println("Contains 30: " + list.contains(30));

        System.out.println("Removed element at index 2: " + list.remove(2));

        System.out.println("Updated size of the list: " + list.size());
    }
}