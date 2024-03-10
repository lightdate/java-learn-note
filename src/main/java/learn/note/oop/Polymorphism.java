package learn.note.oop;

public class Polymorphism {
    public static void main(String[] args) {
        AllDog allDog = new AllDog();
        allDog.bark();
    }
}

class Animal {
    public void bark() {
        System.out.println("some voice");
    }
}

/**
 * 子类可以重写并覆盖父类的方法
 * 当子类拥有和父类相同的方法时，优先使用子类的方法
 */
class AllDog extends Animal {
    @Override
    public void bark() {
        System.out.println("Woof! Woof");
    }
}