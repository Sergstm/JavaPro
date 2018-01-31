package homework.lesson1.serialize;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Car mercedes = new Car("Mercedes", 2017, 3.5);

        String path ="src/homework/lesson1/serialize/files/data.txt";
        File file = new File(path);
        CarIO carIO = new CarIO(file);

        //Serialize
        carIO.serializeCar(mercedes);

        //Deserialize
        carIO.deserializeCar();

    }
}
