package CW10;

import java.util.Comparator;

public class PersonSurNameComparator implements Comparator<Person> {
    public int compare(Person a, Person b){

        return a.getSurname().compareTo(b.getSurname());
    }
}

