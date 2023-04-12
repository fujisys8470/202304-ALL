package gakusyu;

import java.util.List;
import java.util.ArrayList; 

public class gakusyu34 {
	public static List<String> main(){
		String str = "東京都";
		
		System.out.println(str.concat("港区赤坂"));
		System.out.println(str + "港区赤坂");
		
		List<String> res = new ArrayList<String>();
		res.add(str.concat("港区赤坂"));
		res.add(str + "港区赤坂");
		
		return res;
	}
}
