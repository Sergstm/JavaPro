package homework.lesson1.container;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@SaveTo(path = "src/homework/lesson1/container/files/file.txt")
public class TextContainer {

    private String text = "Java EE";

    @Saver
    public void save(File file) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(text);
            System.out.println("Write Success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "TextContainer{" +
                "text='" + text + '\'' +
                '}';
    }
}
