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
	private CarsServiceImpl carsService;

	@GetMapping(value = "/hello")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "index";
	}
	@GetMapping("/hello/cars")
	public String carController(@RequestParam(value = "count", required = false) String count, ModelMap model) {
		model.addAttribute("carList", carsService.getSpecifiedNumbersOfCars(count, carsService.getCarList()));
		return "cars";
	}
	
}