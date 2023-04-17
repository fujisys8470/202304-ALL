package gakusyu;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class gakusyu50 {
	public static String main(){
		Path p = Paths.get("C:\\Users\\tmp\\test.txt");
		
		String res = checkFile(p);

		return res;
	}
	
	private static String checkFile(Path p){
		System.out.print("名前:"  + p.getFileName() + "は");
		
		if (Files.exists(p)){
			System.out.println("存在します");
			return "存在します";
		}else{
			System.out.println("存在しません");
			return "存在しません";
		}
	}
}
