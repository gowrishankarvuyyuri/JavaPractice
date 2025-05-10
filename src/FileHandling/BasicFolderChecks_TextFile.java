package FileHandling;

import java.io.File;

class A {
	//creating of a folder
	static void create_folder(String path) {
		
		File folder = new File(path);
		
		if(!folder.exists()) {
			System.out.println("File Not Exists !!");
			
			folder.mkdir();
			System.out.println("File is created at location " + folder);
		}
		else {
			System.out.println("File is present at location " + folder);
		}
	}
	
	//renaming a folder
	static void rename_folder(String oldpath, String newpath) {
		
		File oldfolder = new File(oldpath);
		File newfolder = new File(newpath);
		
		if(oldfolder.exists()) {
			
			oldfolder.renameTo(newfolder);
			System.out.println("Renaming of file is completed to " + newfolder);
		}
	}
	
	//deleting a file
	void delete_folder(String path) {
		
		File folder = new File(path);
		
		if (folder.exists()) {
			
			for(File file : folder.listFiles()) {
				file.delete();
			}
			
			folder.delete();
			System.out.println("Folder Deleted!! at " + path);
		}
		
	}
}

public class BasicFolderChecks_TextFile extends A {
	
	public static void main(String[] args) {
		String path = "C:\\PracticeCheck";
		create_folder(path);
		//A.rename_folder("C:\\PracticeCheck", "C:\\PracticeChecking");
		
		A a = new A();
		//a.delete_folder("C:\\PracticeChecking");

	}

}
