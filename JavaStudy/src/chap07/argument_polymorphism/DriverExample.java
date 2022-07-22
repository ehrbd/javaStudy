package chap07.argument_polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Vehicle bus = new Bus();
		Vehicle taxi = new Taxi();
		Vehicle vehicle = new Vehicle();
		Vehicle motorcycle = new MotorCycle();
		
		driver.drive(taxi);
		driver.drive(bus);
		driver.drive(vehicle);
		driver.drive(motorcycle);
		
		driver.drive(new Taxi());
		driver.drive(new Bus());
		
		

	}

}
