package single;

public class SingleThreaded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleThreaded pri = new SingleThreaded();
		pri.PrintNumbers();
		for(int j=0;j<=200;j++)
			System.out.println("j = " + j );
		
	}
	void PrintNumbers()
	{
		for(int i=0;i<=200;i++)
			System.out.println("i = " + i );
	}

}
