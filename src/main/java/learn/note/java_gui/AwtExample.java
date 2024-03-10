package learn.note.java_gui;


import java.awt.*;

public class AwtExample {
    public static void main(String[] args) {
        // 创建窗口
        Frame frame = new Frame("AWT Example");

        // 创建按钮
        Button button = new Button("Click me");

        // 将按钮添加到窗口
        frame.add(button);

        // 设置窗口大小和可见性
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
