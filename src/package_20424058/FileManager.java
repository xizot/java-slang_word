package package_20424058;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class FileManager {
	String resetPath, dataPath,searchHistoryPath,deleteHistoryPath;
	
	FileManager(){
		String sourceFolder = System.getProperty("user.dir");
		this.resetPath = sourceFolder+"/data/backup.txt";
		this.dataPath = sourceFolder+"/data/data.txt";
		this.searchHistoryPath = sourceFolder+"/data/search-history.txt";
		this.deleteHistoryPath = sourceFolder+"/data/delete-history.txt";
	}
	
	FileManager(String resetPath, String dataPath, String searchHistoryPath, String  deleteHistoryPath){
		this.resetPath = resetPath ;
		this.dataPath= dataPath;
		this.searchHistoryPath = searchHistoryPath;
		this.deleteHistoryPath = deleteHistoryPath;
	}
	
	public boolean isValidFile(File file) {
		if(!file.isDirectory()) return true;
		return false;
	}
	
	
	public HashMap<String, String[]> getDictionary(){
		HashMap<String, String[]> dictionary = new HashMap<String, String[]>();
		
		File file = new File(this.dataPath);
		if(isValidFile(file)) {
			try {
				FileReader fis = new FileReader(file);
				BufferedReader br = new BufferedReader(fis);
				String line;
				while((line = br.readLine()) != null) {
					String[] splitLine = line.split("`");
					if(splitLine.length >= 2) {
						String word = splitLine[0];
						String[] definition =  splitLine[1].split("\\s*\\|\\s*");
						dictionary.put(word, definition);
					}
					
				}
				br.close();
			}
			catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
		else {
			System.out.print("The path is not valid");
		}
		
		return dictionary;
	}
	public HashMap<String, String[]> getDictionary(String Path){
		HashMap<String, String[]> dictionary = new HashMap<String, String[]>();
		
		File file = new File(Path);
		if(isValidFile(file)) {
			try {
				FileReader fis = new FileReader(file);
				BufferedReader br = new BufferedReader(fis);
				String line;
				while((line = br.readLine()) != null) {
					String[] splitLine = line.split("`");
					if(splitLine.length >= 2) {
						String word = splitLine[0];
						String[] definition =  splitLine[1].split("\\s*\\|\\s*");
						dictionary.put(word, definition);
					}
					
				}
				br.close();
			}
			catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
		else {
			System.out.print("The path is not valid");
		}
		
		return dictionary;
	}
	public ArrayList<String> getHistory(){
		ArrayList<String> histories = new ArrayList<String>();
		return histories;
	}
	
	public HashMap<String, String[]> resetDictionary() {	
		return this.getDictionary(this.resetPath);
	}
}
