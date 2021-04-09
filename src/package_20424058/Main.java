package package_20424058;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		FileManager fm = new FileManager();
		HashMap<String, String[]> dictionary = fm.getDictionary();
		SlangManager sm = new SlangManager(dictionary);
		
		
		ProjectManager.showMenu(sm, fm);
	}

}
