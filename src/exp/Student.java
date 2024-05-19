package exp;

class Student1 {
    String name;
    int age;

    void Student1() {
        Student1("James", 25);
    }

    void Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Student {
    public static void main(String[] args) {
        Student1 s = new Student1();
        System.out.println(s.name + ":" + s.age);
    }
}