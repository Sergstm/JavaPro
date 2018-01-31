package homework.lesson1.container;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        TextContainer container = new TextContainer();
        Class<TextContainer> aClass = TextContainer.class;

        SaveTo annotation = aClass.getAnnotation(SaveTo.class);
        File file = new File(annotation.path());

        try {
            Method method = aClass.getDeclaredMethod("save", File.class);
            Saver saver = method.getAnnotation(Saver.class);
            method.invoke(container,file);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
