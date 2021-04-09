package package_20424058;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
public class SlangManager {
	public HashMap<String, String[]> dictionary = new HashMap<String, String[]>();
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
			System.out.print("Can't find definition.");
			return;
		}
		for (int i = 0; i < words.size(); i++) {
			
			System.out.println(i+1 +": "+ words.get(i));
		}
	}
	public void showDefinition(String[] definition) {
		if(definition == null) {
			System.out.print("Can't find definition.");
			return;
		}
		for (int i = 0; i < definition.length; i++) {
			System.out.println(i+1 +": "+definition[i].trim());
		}
	}
}
