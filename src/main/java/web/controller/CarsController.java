package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImpl;
import web.services.CarsService;
import web.services.CarsServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
	@Autowired
	private CarsService carsService;

	@GetMapping("/cars")
	public String carController(@RequestParam(value = "count", required = false) String count, ModelMap model) {
		model.addAttribute("carList", carsService.getSpecifiedNumbersOfCars(count, carsService.getCarList()));
		return "cars";
	}
	
}