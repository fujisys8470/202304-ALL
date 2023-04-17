package gakusyu;

import java.nio.file.Path;
import java.nio.file.Paths;

public class gakusyu46 {
	public static String main(){
		Path p1 = Paths.get("C:/data/image");
		Path p2 = Paths.get("photo/profile.jpg");
		
		Path p3 = p1.resolve(p2);

		System.out.println(p3);
		String res = p3.toString();
		return res;
	}
}
