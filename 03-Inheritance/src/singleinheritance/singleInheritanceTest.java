package singleinheritance;

public class singleInheritanceTest {

	public static void main(String[] args) {
		singleInheritance si = new singleInheritance();
		si.m1();
		System.out.println(si.getClass());
		System.out.println(si.hashCode());
		System.out.println(si.toString());
		singleInheritance si2 = new singleInheritance();
		System.out.println(si2.toString());
	}
	
}