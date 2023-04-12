package gakusyu;

public class gakusyu35 {
	public static String main(){
		String str2= "東京都港区";
		
		System.out.println(str2);
		System.out.println(str2.replace("港区", "中央区"));
		
		String res = str2.replace("港区", "中央区");
		return res;
	}
}
