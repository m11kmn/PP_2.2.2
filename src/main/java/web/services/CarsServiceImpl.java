package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarsServiceImpl implements CarsService{

    @Autowired
    private CarDao carDao;

    private final List<Car> carList = new ArrayList<>();


    {
        carList.add(new Car("Ford", 2014, 123));
        carList.add(new Car("BMW", 2016, 421));
        carList.add(new Car("Audi", 2020, 634));
        carList.add(new Car("Lada", 1999, 532));
        carList.add(new Car("Honda", 2005, 325));
    }

    public List<Car> getCarList() {
        return carList;
    }

    @Override
    public List<Car> getSpecifiedNumbersOfCars(String count, List<Car> carList) {
        return carDao.getSpecifiedNumbersOfCars(count, carList);
    }
}
