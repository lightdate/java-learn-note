package learn.note.thread;

public class CreateThread {
    /**
     * 继承Thread类，然后重写run方法
     */
    public static void inheritThread() {
        Thread thread = new Task();
        thread.start();
    }

    /**
     * 实现Runnable 接口
     */
    public static void realizeRunnable() {
        Thread thread = new Thread(new RunnableTask());
        thread.start();
    }

    /**
     * 通过使用lambda 语法语法给定执行任务
     */
    public static void lambdaRunnable() {
        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getId() + " value: " + i);
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
