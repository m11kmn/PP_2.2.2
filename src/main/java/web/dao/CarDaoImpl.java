package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    private List<Car> carList;

    public List<Car> getSpecifiedNumbersOfCars(String count, List<Car> carList) {
        if (count == null) {
            return carList;
        }
        int intCount = Integer.parseInt(count);
        if (intCount >= 5) {
            return carList;
        }
        return carList.stream().limit(intCount).collect(Collectors.toList());
    }

}
