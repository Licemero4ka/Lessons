package CW10;

import java.util.Comparator;
import java.util.TreeSet;

public class Person {
    private String name;
    private String  surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    String getName(){
        return name;
    }
    String getSurname(){
        return surname;
    }
    int getAge(){
        return age;
    }

    public static void main(String[] args){
        Comparator<Person> pcomp = new PersonNameComparator().thenComparing(new PersonSurNameComparator().thenComparing(new PersonAgeComparator()));
        TreeSet<Person> people = new TreeSet(pcomp);
        people.add(new Person("Tom","Holand",23));
        people.add(new Person("Mick","Sallivan", 34));
        people.add(new Person("Tom","Ford", 10));
        people.add(new Person("Bill","Gates", 14));

        for(Person  p : people){

            System.out.println(p.getName() + " " + p.getSurname() + " " + p.getAge());
        }
    }
}

