package package_20424058;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class ProjectManager {
	public static void showMenu(SlangManager sm, FileManager fm) {
		char y = 'y';
		Scanner sc = new Scanner(System.in);
		while(y == 'y') {
			System.out.println("===========MENU=================");
			System.out.println("1. Find word with slang word");
			System.out.println("2. Find word with definition");
//			System.out.println("3. Find word with slang word");
			System.out.println("4. Add slang word");
//			System.out.println("5. Find word with slang word");
//			System.out.println("6. Find word with slang word");
//			System.out.println("7. Find word with slang word");
//			System.out.println("8. Find word with slang word");
//			System.out.println("9. Find word with slang word");
//			System.out.println("10. Find word with slang word");
			System.out.println("================================");
			System.out.print("You chosse?  ");
			int chosse = sc.nextInt();
			switch (chosse) {
				case 1:
					System.out.print("Enter the search word: ");
					String word = new Scanner(System.in).nextLine();
					Instant start = Instant.now();
					//your code
					sm.showDefinition(sm.findWithSlangWord(word));
					Instant end = Instant.now();
					Duration timeElapsed = Duration.between(start, end);
					System.out.println("\nTime taken: "+ timeElapsed.toMillis() +" milliseconds");
					break;
				case 2:
					System.out.print("Enter the definition to search: ");
					String definition = new Scanner(System.in).nextLine();
					Instant start1 = Instant.now();
					sm.showWords(sm.findWithDefinition(definition));
					Instant end1 = Instant.now();
					Duration timeElapsed1 = Duration.between(start1, end1);
					System.out.println("\nTime taken: "+ timeElapsed1.toMillis() +" milliseconds");
					break;
				case 4:
					sm.addNew();
					break;
				default:
					break;
			}
			System.out.print("\nNhan 'y' de tiep tuc chuong trinh. Hoac an phim bat ki de ket thuc: ");
			y = sc.next().charAt(0);
		}
	}
}
