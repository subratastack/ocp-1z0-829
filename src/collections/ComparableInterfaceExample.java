package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        /*if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        }
        return 0;*/
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        } else if (o1.getAge() < o2.getAge()) {
            return -1;
        }
        return 0;
    }
}

public class ComparableInterfaceExample {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        persons.add(new Person("A", 32));
        persons.add(new Person("B", 16));
        persons.add(new Person("C", 12));
        persons.add(new Person("D", 47));
        persons.add(new Person("E", 23));

        System.out.println("Before sorting...");
        printPerson(persons);

        Collections.sort(persons);

        System.out.println("After sorting using Comparable<T> interface...");
        printPerson(persons);

        System.out.println("After sorting using Comparator<T> interface...");
        PersonComparator pc = new PersonComparator();
        Collections.sort(persons, pc);
        printPerson(persons);

        System.out.println("After sorting using Comparator.comparing...");
        Comparator<Person> c = Comparator.comparing(Person::getName);
        Collections.sort(persons, c);
        printPerson(persons);

        System.out.println("After sorting using Comparator.comparing reversed...");
        Comparator<Person> c1 = Comparator.comparing(Person::getName).reversed();
        Collections.sort(persons, c1);
        printPerson(persons);
    }

    public static void printPerson(List<Person> persons) {
        persons.stream().forEach(System.out::println);
    }
}
