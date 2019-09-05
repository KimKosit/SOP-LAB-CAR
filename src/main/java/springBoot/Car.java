package springBoot;

public class Car {

	private int carID;
	private String carName;
	private String carColor;
	private String carType;
	private int carDisplacement;
	private boolean carSunroof;
	private int carSpeed;
	
	public Car() {
		super();
	}
	
	public Car(int carID, String carName, String carColor, String carType, int carDisplacement, boolean carSunroof, int carSpeed) {
		super();
		this.carID = carID;
		this.carName = carName;
		this.carColor = carColor;
		this.carType = carType;
		this.carDisplacement = carDisplacement;
		this.carSunroof = carSunroof;
		this.carSpeed = carSpeed;
	}
	
	public int getCarID() {
		return carID;
	}

	public void setCarID(int carID) {
		this.carID = carID;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public int getCarDisplacement() {
		return carDisplacement;
	}

	public void setCarDisplacement(int carDisplacement) {
		this.carDisplacement = carDisplacement;
	}

	public boolean isCarSunroof() {
		return carSunroof;
	}

	public void setCarSunroof(boolean carSunroof) {
		this.carSunroof = carSunroof;
	}

	public int getCarSpeed() {
		return carSpeed;
	}

	public void setCarSpeed(int carSpeed) {
		this.carSpeed = carSpeed;
	}
	
	
}
