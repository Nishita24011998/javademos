package multi;

public class MultiThread extends Thread{
	public static void main(String[] args) throws InterruptedException {
		MultiThread mt = new MultiThread();
		//mt.setName("loop ka Ram "); agar loop ka naam rakhna h " Ram "
		mt.start();
		
		String tname = Thread.currentThread().getName();
		
		for (int j=1; j<=10; j++) {
			System.out.println(tname + ": j: " + j + "\t");
			Thread.sleep(500);
		}
	}

	@Override
	public void run() {
		String tname = Thread.currentThread().getName();
		for (int i=1; i<=10; i++) {
			System.out.println(tname + ": i: " + i + "\t");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}