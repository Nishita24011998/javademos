package checked;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\javafsd\\javademos\\testfile.txt");
		}
		catch(FileNotFoundException e) {
			System.out.println("File not Found");	
		}
	}
}
