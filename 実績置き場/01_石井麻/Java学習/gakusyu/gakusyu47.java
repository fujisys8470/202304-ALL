package gakusyu;

import java.nio.file.Path;
import java.nio.file.Paths;

public class gakusyu47 {
	public static String main(){
		Path p1 = Paths.get("");
		Path p2 = p1.toAbsolutePath();

		String res = p2.toString();
		System.out.println(res);
		return res;
	}
}
