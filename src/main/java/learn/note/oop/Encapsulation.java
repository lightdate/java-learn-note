package learn.note.oop;

/**
 * 封装
 */
public class Encapsulation {
    public static void main(String[] args) {
        Dog dog = new Dog("mimi", 3);
        dog.print();
    }
}

/**
 * 对Dog类的封装
 */
class Dog {
    private final String name;
    private final Integer age;

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println(name + ": " + age);
    }
}