package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.List;

public interface CarDao {
    public List<Car> getSpecifiedNumbersOfCars(String count, List<Car> carList);
}
