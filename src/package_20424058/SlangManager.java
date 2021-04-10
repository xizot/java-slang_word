package package_20424058;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Arrays;


public class SlangManager {
	public HashMap<String, String[]> dictionary = new HashMap<String, String[]>();
	public ArrayList<String> searchHistory = new ArrayList<String>();
	
	public SlangManager(HashMap<String, String[]> dictionary) {
		this.dictionary = dictionary;
	}
	public void showWord(String word, String[] definition) {
		System.out.println(word +": " + String.join(", ", definition));
	}
	public String[] findWithSlangWord(String word) {
		return this.dictionary.get(word);
	}
	public ArrayList<String> findWithDefinition(String definition) {
		ArrayList<String> words = new ArrayList<String>();
		 for (Entry<String, String[]> entry : this.dictionary.entrySet()) {
			 	String[] value = entry.getValue();
			 	if(Arrays.asList(value).contains(definition))
	            	words.add(entry.getKey());
	        }
		 return words;
	}
	public void showWords(ArrayList<String> words) {
		if(words.size() <= 0) {
			System.out.print("Not found.");
			return;
		}
		for (int i = 0; i < words.size(); i++) {
			
			System.out.println(i+1 +": "+ words.get(i));
		}
	}
	public void showDefinition(String[] definition) {
		if(definition == null) {
			System.out.print("Not Found.");
			return;
		}
		for (int i = 0; i < definition.length; i++) {
			System.out.println(i+1 +": "+definition[i].trim());
		}
	}
	public void addNew() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a slang word to add: ");
		String word = sc.nextLine();
		System.out.print("Enter definition of this word(split with ','): ");
		String definition = sc.nextLine();
		String[] definitions = definition.split("\\s*,\\s*");
		String[] existWord = this.dictionary.get(word);
		boolean isExist = false;
		if(existWord == null) {
			this.dictionary.put(word, definitions);
		}
		else {
			isExist = true;
			String[] newDefinitions = new String[existWord.length + definitions.length];
			System.arraycopy(existWord, 0, newDefinitions, 0, existWord.length);
			System.arraycopy(definitions, 0, newDefinitions, existWord.length, definitions.length);
			this.dictionary.put(word, newDefinitions);
		}
		
		// add to file
		
		
		
	}
}
