package package_20424058;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sourceFolder = System.getProperty("user.dir");
		File f = new File(sourceFolder+"/data/slang.txt");
		
		
		
		try {
			long startTime = System.nanoTime();
//			System.out.print(sourceFolder);
			FileReader fis = new FileReader(f);
			BufferedReader br = new BufferedReader(fis);
			String line;
			while((line = br.readLine()) != null) {
				String[] splitLine = line.split("`");
				if(splitLine.length >= 2) {
					System.out.println(splitLine[0] + ": "+splitLine[1]);
				}
				
			}
			br.close();
			long endTime = System.nanoTime();

			long duration = (endTime - startTime); 
			System.out.println(duration/1000000 +"ms");
			
		}catch(Exception ex) {
			System.err.print(ex.getMessage());
		}
	}

}
