package gakusyu;

public class gakusyu23 {
	public static String main(){
		int num = 2;
		String res;
		
		switch(num){
		case 5:
			System.out.println("一等賞");
			res = "一等賞";
			break;
		case 2:
			System.out.println("二等賞");
			res = "二等賞";
			break;
		default:
			System.out.println("残念賞");
			res = "残念賞";
		}
		
		return res;
	}
}
