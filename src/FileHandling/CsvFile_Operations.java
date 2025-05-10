package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Csv_Create_Write {
	
	static void create_file() throws IOException {
		
		String filepath = System.getProperty("user.dir") + "\\data\\CsvFile.csv";
		
		FileWriter writer = new FileWriter(filepath);
		
		writer.append("Name, Age, Email \n");
		writer.append("Gowri Shanakar, 23, vgowrishankar2002@gmail.com \n");
		writer.append("Divya Vuyyuri, 27, divyavuyyuri1@gmail.com \n");
		
		writer.close();
	}
}

class Read_Csv {
	
	static void read_file() throws FileNotFoundException {
		
		File file = new File(System.getProperty("user.dir") + "\\data\\CsvFile.csv");
		
		Scanner scanner = new Scanner(file);
		
		scanner.useDelimiter(",");
		
		while(scanner.hasNextLine()) {
			System.out.println(scanner.next()+ "\t");
		}
		
		scanner.close();
		
	}
}

class Read_java_split {
	
	@SuppressWarnings("null")
	static void read_split() throws IOException {
		
		BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\data\\CsvFile.csv"));
		
		String lines = null;
		while((lines=reader.readLine()) != null) {
			
			String[] line = lines.split(",");
			
			for(String ln : line) {
				System.out.print(ln+"\t");
			}
			System.out.println();
		}
	}
}

public class CsvFile_Operations extends Read_java_split {

	public static void main(String[] args) throws IOException {
		
		//Csv_Create_Write.create_file();
		Read_Csv.read_file();
		//read_split();
	}

}
