package homework.lesson1.serialize;

import java.io.Serializable;

public class Car implements Serializable {
    @Save
    private String model;
    @Save
    private int year;
    private double vol;

    public Car() {
    }

    public Car(String model, int year, double vol) {
        this.model = model;
        this.year = year;
        this.vol = vol;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getVol() {
        return vol;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", vol=" + vol +
                '}';
    }
}
