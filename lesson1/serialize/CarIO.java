package homework.lesson1.serialize;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class CarIO {

    private File file;

    public CarIO(File file) {
        this.file = file;
    }

    public void serializeCar(Car car) {
        ArrayList<Object> cars = new ArrayList<>();
        Class<Car> carClass = Car.class;
        Field[] fields = carClass.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Save.class)) {
                field.setAccessible(true);
                try {
                    cars.add(field.get(car));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
        outputStream.writeObject(cars);
            System.out.println("Serialization Success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deserializeCar() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            Object readObject = inputStream.readObject();
            System.out.println(readObject);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
