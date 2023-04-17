package gakusyu;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class gakusyu51 {
	public static String main(){
		Path p = Paths.get("C:\\Users\\tmp\\test.txt");
		
		String res = checkDirectory(p);

		return res;
	}
	
	private static String checkDirectory(Path p){
		System.out.print(p.getFileName() + "は");
		if (Files.isDirectory(p)){
			System.out.println("ディレクトリです");
			return "ディレクトリです";
		}else{
			if (Files.exists(p)){
				System.out.println("ファイルです");
				return "ファイルです";
			}else{
				System.out.println("存在しません");
				return "存在しません";
			}
		}
	}
}
