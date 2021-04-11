package package_20424058;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class ProjectManager {
	public static void showMenu(SlangManager sm, FileManager fm) {
		char y = 'y';
		Instant start,end = null;
		Duration timeElapsed = null;
		while(y == 'y') {
			System.out.println("===========MENU=================");
			System.out.println("1. Find word with slang word");
			System.out.println("2. Find word with definition");
			System.out.println("3. Show History");
			System.out.println("4. Add slang word");
			System.out.println("5. Delete word with slang word");
//			System.out.println("6. Find word with slang word");
			System.out.println("7. Reset to default Slang word");
//			System.out.println("8. Find word with slang word");
//			System.out.println("9. Find word with slang word");
//			System.out.println("10. Find word with slang word");
			System.out.println("================================");
			System.out.print("You chosse?  ");
			int chosse = new Scanner(System.in).nextInt();
			switch (chosse) {
				case 1:
					System.out.print("Enter the search word: ");
					
					String word = new Scanner(System.in).nextLine();
					start = Instant.now();
					
					sm.showDefinition(sm.findWithSlangWord(word));
					
					end = Instant.now();
					timeElapsed = Duration.between(start, end);
					System.out.println("\nTime taken: "+ timeElapsed.toMillis() +" milliseconds");
					
					sm.addToHistory(word);
					break;
				case 2:
					System.out.print("Enter the definition to search: ");
					String definition = new Scanner(System.in).nextLine();
					start = Instant.now();
					sm.showWords(sm.findWithDefinition(definition));
					end = Instant.now();
					timeElapsed = Duration.between(start, end);
					System.out.println("\nTime taken: "+ timeElapsed.toMillis() +" milliseconds");
					sm.addToHistory(definition);
					break;
				case 3:
					sm.showHistory();
					break;
				case 4:
					sm.addNew();
					break;
				case 5:
					System.out.print("\nEnter slang word to delete: ");
					String deleteWord = new Scanner(System.in).nextLine();
					sm.delete(deleteWord);
					break;
				case 7:
					System.out.println("Please wait for the default restore process...");
					sm.dictionary = fm.resetDictionary();
					System.out.println("Default restore is done");
					break;
				default:
					break;
			}
			System.out.print("\nNhan 'y' de tiep tuc chuong trinh. Hoac an phim bat ki de ket thuc: ");
			y = new Scanner(System.in).next().charAt(0);
		}
	}
}
