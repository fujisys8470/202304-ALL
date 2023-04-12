package gakusyu;

public class gakusyu19 {
	public static int main(){
		int num = 1;
		
		for (int i = 0; i < 100; i++){
			num *= 2;
			System.out.println("num = " + num);
			
			if (num > 10000){
				break;
			}
		}

		System.out.println("End");
		return num;
	}
}
