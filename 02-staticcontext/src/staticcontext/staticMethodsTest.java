package staticcontext;

public class staticMethodsTest {
	static void method1() {
		System.out.println("Inside Static Method - method1()");
	}
	
	static {
		System.out.println("Inside static block");
		staticMethodsTest.method1();
	}
	
	public static void main(String[] args) {
		System.out.println("inside main method");
		staticMethodsTest.method1();
	}

}
