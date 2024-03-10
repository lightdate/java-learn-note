package learn.note.design_pattern;

public class Singleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.print();
    }

    private static Singleton instance;


    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void print() {
        System.out.println("Hello!!!");
    }
}

