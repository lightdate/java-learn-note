package learn.note.funcational_interface;

public class Interface {
    public static void main(String[] args) {
        FunctionInterface functionInterface = () -> {
            System.out.println("Hello, functional interface");
        };
        functionInterface.aMethod();
    }
}

