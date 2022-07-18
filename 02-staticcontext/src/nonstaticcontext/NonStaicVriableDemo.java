package nonstaticcontext;

public class NonStaicVriableDemo {
static int y = 10;
	
	// non-static variable
	// instance variable
	int num;
	
	static {
		System.out.println("Inside static block");
	}
	
	{
		System.out.println("Inside non static block");
	}
	
	NonStaicVriableDemo(int x) {
		System.out.println("Inside the constructor");
		this.num = x;
	}
	
	public static void main(String[] args) {
		System.out.println("inside main method");
		
		NonStaicVriableDemo nsvd1 = new NonStaicVriableDemo(20);
		nsvd1.num = 7;
		
		NonStaicVriableDemo nsvd2 = new NonStaicVriableDemo(21);
		NonStaicVriableDemo nsvd3 = new NonStaicVriableDemo(22);
		
		System.out.println(nsvd1.num);
		System.out.println(nsvd1.y);
		
		System.out.println(nsvd2.num);
		System.out.println(nsvd2.y);
		
		System.out.println(nsvd3.num);
		System.out.println(nsvd3.y);
	}
}
