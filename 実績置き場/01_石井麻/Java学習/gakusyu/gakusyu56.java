package gakusyu;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class gakusyu56 {
	public static void main(){
		try{
			File file = new File("C:\\Users\\tmp\\test.txt");
			
			if (checkBeforeReadfile(file)){
				FileReader filereader = new FileReader(file);
				
				int ch;
				while((ch = filereader.read()) != -1){
					System.out.print((char)ch);
				}
				
				filereader.close();
			}else{
				System.out.println("ファイルが見つからないか開けません");
			}
		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e){
			System.out.println(e);
		}
	}
	
	private static boolean checkBeforeReadfile(File file){
		if (file.exists()){
			if (file.isFile() && file.canRead()){
				return true;
		}
	}
	
	return false;
   }
}
