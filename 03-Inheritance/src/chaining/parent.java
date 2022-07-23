package chaining;

public class parent {
int x;
	
	parent() {
//		this(25);
		System.out.println("Parent constructor: No Args" );
	}
	
	parent(int x) {
		this.x = x;
		System.out.println("Parent Constructor: One Arg");
	}
}
