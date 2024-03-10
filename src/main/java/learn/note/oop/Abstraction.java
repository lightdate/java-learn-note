package learn.note.oop;

public class Abstraction {
    public static void main(String[] args) {
        People people = new Baby();
        people.talk();
    }
}

/**
 * 可以抽象出多种事物的共有属性
 */
interface People {
    void talk();
}

class Baby implements People {

    @Override
    public void talk() {
        System.out.println("啊，啊，啊!!!");
    }
}
