package overriding;

public class Bike extends vehicle{
Bike(){
	System.out.println("Bike object: " + this);
}
	String fuel() {
		return "CNG";
	}
}
