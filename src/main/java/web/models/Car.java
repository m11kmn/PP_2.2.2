package web.models;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class Car {
    private String model;
    private int year;
    private int series;

    public Car(String model, int year, int series) {
        this.model = model;
        this.year = year;
        this.series = series;
    }

    private final static List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Ford", 2014, 123));
        carList.add(new Car("BMW", 2016, 421));
        carList.add(new Car("Audi", 2020, 634));
        carList.add(new Car("Lada", 1999, 532));
        carList.add(new Car("Honda", 2005, 325));
    }

    public static List<Car> getCarList() {
        return carList;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
