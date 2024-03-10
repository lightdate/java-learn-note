package learn.note.exception;

import java.io.BufferedReader;
import java.io.FileReader;

public class Handling {
    public static void main(String[] args) {
        SomeOperation someOperation = new SomeOperation();
    }
}

class SomeOperation {

    /**
     * 捕获错误，finally 无论是否异常都会执行，通常用于关闭资源
     */
    public void tryCatch() {
        try {
            System.out.println("name");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("完成");
        }
    }

    /**
     * () 用于处理可以自动关闭的方法
     * 实现了closeable接口的类
     */
    public void tryResourceClose() {
        String fileName = "E:\\learn-note\\databases\\dataTools\\createDatabase.sql";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String result;
            while ((result = reader.readLine()) != null) {
                System.out.println(result);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

