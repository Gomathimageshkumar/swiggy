package test.org;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;


public class Employees {
	public static void main(String[] args) throws IOException  {
		File f = new File("C:\\Add\\sub\\mul\\div\\Inheritance.txt");
		File f1 = new File("C:\\Add\\sub\\mul\\div\\test.txt");
		FileUtils.copyFile(f, f1);
		List<String> readLines = FileUtils.readLines(f1);
		for (String x : readLines) {
			System.out.println(x);
			
		}
		}
		
}
