package chaining;

public class child extends parent{
	child() {
		System.out.println("Child Constructor: No Args");
	}
	
	child(int x) {
//		super(x);
		System.out.println("Child Constructor: One Arg");
	}

}
