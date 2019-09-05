package springBoot;

import java.util.ArrayList;
import java.util.List;

public class CarService {
	
	private static List<Car> cars = new ArrayList<Car>();

	public List<Car> listCar(){
		return cars;
	}
	
	public Car findCar(int carID) {
		for (Car car: cars) {
			if (car.getCarID() == carID) {
				return car;
			}
		}
		return null;
	}
	
	public String updateCar(int carID, Car updateCar) {
		for (Car car: cars) {
			if (car.getCarID() == carID) {
				car.setCarName(updateCar.getCarName());
				car.setCarColor(updateCar.getCarColor());
				car.setCarType(updateCar.getCarType());
				car.setCarDisplacement(updateCar.getCarDisplacement());
				car.setCarSunroof(updateCar.isCarSunroof());
				car.setCarSpeed(updateCar.getCarSpeed());
			}
		}
		return "Updated";
	}
	
	public String addCar(Car car) {
		cars.add(CarFactory.create(car.getCarID(), car.getCarName(), car.getCarColor(), car.getCarType(), car.getCarDisplacement(), car.isCarSunroof(), car.getCarSpeed()));
		return "Added";
	}
	
	public String deleteCar(int carID) {
		for (int i=0; i<cars.size(); i++) {
			Car element = cars.get(i);
			if (element.getCarID() == carID) {
				cars.remove(i);
				return "Removed";
			}
		}
		return "Error";
	}
	
}
