package runnabledemo;

public class RunnableTest {

public static void main(String[] args) throws InterruptedException {
		
		String tName = Thread.currentThread().getName();
		System.out.println(tName + ": Main method Begin...");
		
		CheckProcessor cp = new CheckProcessor();
		Thread t = new Thread(cp);
		t.setName("CP");
		t.start();
		
		t.join();
		
		System.out.println(tName + ": Main method Ends...");
		
	}

}
///output
// with join (t.join();)
// isme main main ke bad thread join hoga then teesra wala main chalega.
// Main method Begin..
// Processed the checks.
// Main method Ends...
// ************************
//without join
//isme main main ke bad ,,,main hi chalega kuki join add nhi kia then thread chalega.
//Main method Begin..
//Main method Ends...
//Processed the checks.