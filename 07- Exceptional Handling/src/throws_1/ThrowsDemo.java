package throws_1;

public class ThrowsDemo {

	public static void main(String[] args) {
		ThrowsDemo obj = new ThrowsDemo();
		try {
			int withDrawAmount = 5000;
			System.out.println("Withdrawing: " + withDrawAmount);
			obj.withdrawFromATM(withDrawAmount, 4538);
			System.out.println("Amount Withdrawn");
		} catch (RuntimeException ex) {
			System.out.println("Exception Occurred. " + ex.getMessage());
		}
	}
	
	void withdrawFromATM(int withDrawAmount, int accountNumber) {
		int balance = getBalanceFromAccount(accountNumber);
		if (withDrawAmount > balance) {
			throw new RuntimeException("Division by zero");
			
		} 
	}
	
	int getBalanceFromAccount(int accountNumber) {
		return 1000;
	}
}