package gakusyu;

public class gakusyu39 {
	public static String main(){
		int num;
		String kekka;
		
		num = 9;
		kekka = hantei(num);
		System.out.println(num + "は" + kekka);
		
		return kekka;
	}
	
	private static String hantei(int n){
		if (n % 2 == 0){
			return "偶数";
		}else{
			return "奇数";
		}
	}
}
