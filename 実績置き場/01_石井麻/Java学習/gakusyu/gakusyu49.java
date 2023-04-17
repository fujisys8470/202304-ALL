package gakusyu;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class gakusyu49 {
	public static String main(){
		Path p = Paths.get("C:\\Users\\tmp\\test.txt");
		
		try{
			Files.deleteIfExists(p);
		}catch(IOException e){
			System.out.println(e);
		}

		System.out.println("ファイルを削除しました。");
		return "0";
	}
}
