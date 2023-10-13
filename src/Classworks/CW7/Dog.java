package Classworks.CW7;

public abstract class Dog extends Animal{

    @Override
    final void makevoice() {
        System.out.println("Yes dog is Barking");
    }

    void walking() {
        System.out.println("I walk on 4 legs");
    }
}
