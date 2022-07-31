package fis;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FisDemo {
public static void main(String[] args) {
		
		File myfile = new File("C:\\javafsd\\temp\\file1.txt");
		
		FileInputStream fis = null;
		int count =0;
		try {
			fis = new FileInputStream(myfile);
			System.out.println("File successfully opened");
			int i;
			while ( (i = fis.read()) != -1) {
				count++;
				System.out.print((char) i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(" \n");
			System.out.println("File closed");
			System.out.println("Total bytes read: " + count);
		}
		
		
	}
	
}