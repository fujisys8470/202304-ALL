package gakusyu;

import java.nio.file.Path;
import java.nio.file.Paths;

public class gakusyu45 {
	public static int main(){
		Path p1 = Paths.get("C:/code/java/file/doc/report.txt");
		System.out.println(p1.getNameCount());
		
		int res = p1.getNameCount();
		return res;
	}
}
