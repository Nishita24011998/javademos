package overriding;

public class Car extends vehicle{
	Car(){
		System.out.println("Car object:" + this);
	}
	String fuel() {
		return "Diesel";
	}
}
