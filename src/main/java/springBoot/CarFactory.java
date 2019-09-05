package springBoot;

public class CarFactory {

	public static Car create(int carID, String carName, String carColor, String carType, int carDisplacement, boolean carSunroof, int carSpeed) {
		return new Car(carID, carName, carColor, carType, carDisplacement, carSunroof, carSpeed);
	}
	
}
