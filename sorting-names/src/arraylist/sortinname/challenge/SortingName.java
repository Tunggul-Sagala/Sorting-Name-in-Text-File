package arraylist.sortinname.challenge;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingName {
	
	private static String directory =System.getProperty("user.dir");
	private static List<String> nameList =new ArrayList<>();
	
	public static void main(String[] args) {	
		readFile();
		sortFile();
		writeFile();
		print();
	}
	
	private static void readFile() {
		try {
			nameList =Files.readAllLines(Paths.get(directory, "unsorted-name-list.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void sortFile() {
		Collections.sort(nameList);
	}
	
	private static void writeFile() {
		try {
			Files.write(Paths.get(directory, "sorted-name-list.txt"), nameList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void print() {
		for (String name:nameList) {
			System.out.println(name);
		}
	}

}
