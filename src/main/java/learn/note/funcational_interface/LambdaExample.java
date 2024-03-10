package learn.note.funcational_interface;

public class LambdaExample {
    public void useLambda() {
        Runnable runnable = () -> {
            System.out.println("Hello, lambda");
        };
    }
}
