图形用户界面（GUI）是一种用户与计算机程序进行交互的方式，通过图形元素（如按钮、文本框、窗口等）和图形控制来展示和操作信息。在 Java 中，创建 GUI 应用程序通常使用 Java 的图形库，主要有 AWT（Abstract Window Toolkit）和 Swing。

### AWT（Abstract Window Toolkit）：

AWT 是 Java 的最早的 GUI 库，提供了一组与平台无关的 GUI 组件，这些组件是通过调用本地操作系统的 GUI 组件实现的。AWT 的组件包括按钮、文本框、标签、窗口等。

示例代码，创建一个简单的 AWT 窗口：

```java
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
```

### Swing：

Swing 是在 AWT 的基础上开发的更高级别的 GUI 库，提供了丰富的组件、更强大的定制能力和更好的跨平台性。Swing 的组件包括 JFrame、JButton、JTextField 等。

示例代码，创建一个简单的 Swing 窗口：

```java
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
```

在实际开发中，Swing 更为常用，因为它提供了更多的组件和更灵活的定制选项。此外，现代的 Java GUI 开发也可以使用 JavaFX，它是 Java 平台上的下一代 GUI 工具包，提供了更现代的界面设计和更好的性能。