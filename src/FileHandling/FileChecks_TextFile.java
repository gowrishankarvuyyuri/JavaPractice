package FileHandling;

import java.io.*;
import java.util.Scanner;

class B {
	
	//create a file
	public static void create_file(String path) throws IOException {
		
		File file = new File(path);
		
		if (!file.exists()) {
			
			file.createNewFile();
			System.out.println("File created at location :" +path);
		}
		else 
			System.out.println("File already exists!! No need of creating again");
	}
	
	//wrinting data to a file
	static void write_to_file(String path) throws IOException {
		
		FileWriter writer = new FileWriter(path); 
		
		writer.write("1");
		writer.close();
		
		System.out.println("Writing into a file is completed");
	}
	
	//reading data from a file
	void read_data(String path) {
		
		try {
			File file = new File(path);
			
			try (Scanner scanner = new Scanner(file)) {
				
				while(scanner.hasNextLine()) {
					System.out.println(scanner.nextLine());
				}
			}
		}
		catch(Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}
	
	//renaming a file
	static void rename_folder(String oldpath, String newpath) {
		
		File oldfile = new File(oldpath);
		File newfile = new File(newpath);
		
		if(oldfile.exists()) {
			
			oldfile.renameTo(newfile);
			System.out.println("Renaming of file is completed to " + newfile);
		}
		else
			System.out.println("File Not Exists, Renaming can't be done!!");
	}
	
	//deleting a file
	void delete_file(String path) {
		
		File file = new File(path);
		
		if(file.delete())
			System.out.println("File Deleted Successfully!!");
		else
			System.out.println("File not Deleted, since not exists!!");
				
	}
}

public class FileChecks_TextFile {

	public static void main(String[] args) throws IOException {

		//B.create_file("C:\\PracticeCheck\\CreatedFile.txt");
		//B.write_to_file("C:\\PracticeCheck\\CreatedFile.txt");
		
		B b = new B();
		//b.read_data("C:\\PracticeCheck\\CreatedFile.txt");
		
		//B.rename_folder("C:\\PracticeCheck\\CreatedFile.txt", "C:\\PracticeCheck\\CreatedNewFile.txt");
		b.delete_file("C:\\PracticeCheck\\CreatedNewFile.txt");
	}

}
