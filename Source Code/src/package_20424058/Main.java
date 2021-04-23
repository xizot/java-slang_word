package package_20424058;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		FileManager fm = new FileManager();
		HashMap<String, String[]> dictionary = fm.getDictionary();
		ArrayList<String> searchHistory = fm.getHistory();
		SlangManager sm = new SlangManager(dictionary, searchHistory);
		
		ProjectManager.showMenu(sm, fm);
	}

}
