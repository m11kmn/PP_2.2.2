package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarDao {

    private List<Car> carList = Car.getCarList();

    public List<Car> getSpecifiedNumbersOfCars(String count) {
        if (count == null) return carList;
        int intCount = Integer.parseInt(count);
        if (intCount >= 5) return carList;
        return carList.stream().limit(intCount).collect(Collectors.toList());
    }

}
