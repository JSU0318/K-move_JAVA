package singleton;

public class CarFactory {

	
	private static CarFactory instance = new CarFactory();
	private static int carNumber = 10000;
	
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	public Car createCar() {
		carNumber++;
		return new Car(carNumber);
	}
	
}
