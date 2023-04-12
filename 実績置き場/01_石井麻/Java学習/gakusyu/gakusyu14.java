package gakusyu;

public class gakusyu14 {
	public static int main(){
		int num = 1;
		
		while (true){
			System.out.println("num = " + num);
			num *= 2;
			
			if (num > 10){
				break;
			}
		}
		
		return num;
	}
}
