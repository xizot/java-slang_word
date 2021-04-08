package package_20424058;

import java.util.Scanner;

public class Slang {
	private String word;
	private String [] definitions;
	public Slang() {
		this.word = "";
		this.definitions = null;
	}
	public Slang(String word, String[] definitions) {
		this.word = word;
		this.definitions = definitions;
	}
	public String getWord() {
		return this.word;
	};
	public String[] getDefinitions() {
		return this.definitions;
	};
	public void setWord(String word) {
		this.word = word;
	}
	public void setDefinitions(String[] definitions) {
		this.definitions = definitions;
	}
	public Slang addNew() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n===Add New Slang====");
		System.out.println("\nAdd Word: ");
		this.word =scanner.nextLine();
		System.out.println("\nAdd Definitions: ");
		String def = scanner.nextLine();
		this.definitions = def.split(",");
		return this;
	}
	
}
