package homework.lesson1.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        Class<MyClass> aClass = MyClass.class;

        Method[] methods = aClass.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)){
                Test annotation = method.getAnnotation(Test.class);
                try {
                    method.invoke(myClass, annotation.a(), annotation.b());
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
