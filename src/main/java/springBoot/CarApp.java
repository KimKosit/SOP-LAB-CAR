package springBoot;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@SpringBootApplication
@RestController

public class CarApp {
	
	CarService service = new CarService();

	public static void main(String[] args) {
		SpringApplication.run(CarApp.class, args);
	}
	
	@RequestMapping("/")
	String home() {
		return "Car CRUD";
	}
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public List<Car> listCar(){
		return service.listCar();
	}
	
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public String addCar(@RequestBody Car car) {
		return service.addCar(car);
	}
	
	@RequestMapping(value="/update/{carID}",method=RequestMethod.PUT)
	public String updateCar(@PathVariable int carID, @RequestBody Car car) {
		return service.updateCar(carID, car);
	}
	
	@RequestMapping(value="/delete/{carID}", method=RequestMethod.DELETE)
	public String deleteCar(@PathVariable int carID) {
		return service.deleteCar(carID);
	}
	
}
