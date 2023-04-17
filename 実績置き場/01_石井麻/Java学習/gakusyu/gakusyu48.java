package gakusyu;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class gakusyu48 {
	public static String main(){
		Path p = Paths.get("C:\\Users\\tmp");
		
		try{
			Files.createDirectory(p);
		}catch(IOException e){
			System.out.println(e);
		}

		System.out.println("ディレクトリを作成しました。");
		return "0";
	}
}
