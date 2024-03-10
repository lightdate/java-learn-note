package learn.note.oop;

public class Inheritance {
    public static void main(String[] args) {
        LittleDog littleDog = new LittleDog();
        littleDog.bark();
    }
}

class ADog {
    public void bark() {
        System.out.println("Woof! Woof!");
    }
}

/**
 * 子类的可以继承父类的方法
 * 所以，子对象可以访问父类的方法
 */
class LittleDog extends ADog {
}
