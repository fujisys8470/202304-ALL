package gakusyu;

public class gakusyu37 {
	public static String main(){
		int eigo = 78;
		
		String res = check("英語", eigo);
		
		return res;
	}
	
	private static String check(String kyoka, int seiseki){
		System.out.print(kyoka + "の試験結果は");
		if (seiseki > 80){
			System.out.println("合格です");
			return "合格です";
		}else{
			System.out.println("不合格です");
			return "不合格です";
		}
	}
}
