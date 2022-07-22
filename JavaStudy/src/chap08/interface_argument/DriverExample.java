package chap08.interface_argument;

public class DriverExample {

	public static void main(String[] args) {	//
		Driver dr = new Driver();
		dr.drive(new Bus());
		dr.drive(new Taxi());
	}

}
