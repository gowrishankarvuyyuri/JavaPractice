package Exception_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Checked_Exception {

	/* using throws keyword which will declare the checked Exceptions */
	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		
		File file = new File(System.getProperty("user.dir"));
		FileInputStream fi = new FileInputStream(file); 	//	--)		throws an FileNotFound Exception
		Thread.sleep(2000); 								//	--)		throws an InteruptedException
	}
	
	
	/* using try-catch block, one catch block can handle all type of Exceptions */
	public void checkedException() {
		
		try {
		File file = new File(System.getProperty("user.dir"));
		FileInputStream fi = new FileInputStream(file);
		Thread.sleep(2000);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	/* using try-catch block, and also catch block can declare explicitly */
	public void checkedException1() {
		
		try {
		File file = new File(System.getProperty("user.dir"));
		FileInputStream fi = new FileInputStream(file);
		Thread.sleep(2000);
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

}
