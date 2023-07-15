package test.org;

import java.io.File;
import java.io.IOException;

public class Employee {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\ Add\\sub\\mul\\div\\inheritance.txt");
		boolean createNewFile = f.createNewFile();
		System.out.println(createNewFile);
		 
	}

}
