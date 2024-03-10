package learn.note.reflect;

public class GetClass {
    /**
     * 通过getClass 方法获得class对象
     */
    public void getClassWithGetClassMethod() {
        Object object = new Object();
        Class<?> aClass = object.getClass();
    }

    public void getClassWithClassProperty() {
        Class<?> aClass = Object.class;
    }

    public void getClassWithForNameMethod() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("learn.note.reflect.GetClass");
    }

    public void getBaseClass() {
        Class<?> aClass = int.class;
    }
}
