package web.services;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.List;
@Service
public interface CarsService {
    List<Car> getSpecifiedNumbersOfCars(String count, List<Car> carList);

    List<Car> getCarList();
}
