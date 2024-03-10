package learn.note.thread;

/**
 * 继承实现任务
 */
public class Task extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getId() + " value: " + i);
        }
    }
}
