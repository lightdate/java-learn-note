package learn.note.base;

import java.awt.event.WindowFocusListener;

public class Classes {
    // 类的成员变量
    public int myVariable;
    // 类静态变量
    public static int variable;
    // 类静态成员常量, 必须拥有初始值, 不可改变
    public static final int intVariable = 10;
    // 类私有变量
    private int privateVariable;
    // 类静态常量
    private static int privateStaticIntVariable;
    // 类私有常量
    private final int privateFinalVariable = 10;

    // ......

    Classes(int myVariable, int privateVariable) {
        this.myVariable = myVariable;
        this.privateVariable = privateVariable;
    }

    /**
     * privateVariable setter 函数
     *
     * @param privateVariable 变量值
     */
    public void setPrivateVariable(int privateVariable) {
        this.privateVariable = privateVariable;
    }
}