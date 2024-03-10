package learn.note.reflect;

import java.lang.reflect.Method;

public class GetMethod {

    private final Class<?> aClass = Object.class;

    public void getMethodWithGetDeclareMethod() {
        Method[] method = aClass.getDeclaredMethods();
    }

    public void getMethodWithGetMethod() {
        Method[] amethod = aClass.getMethods();
    }
}
