package learn.note.java_gui;

import javax.swing.*;

public class SwingExample {
    public static void main(String[] args) {
        // 创建窗口
        JFrame frame = new JFrame("Swing Example");

        // 创建按钮
        JButton button = new JButton("Click me");

        // 将按钮添加到窗口
        frame.getContentPane().add(button);

        // 设置窗口大小、关闭操作和可见性
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
