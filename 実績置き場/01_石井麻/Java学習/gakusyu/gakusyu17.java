package gakusyu;

public class gakusyu17 {
	public static int main(){
		int num = 5;
		
		do{
			System.out.println("num = " + num);
			num -= 2;
			
			if (num < 0){
				break;
			}
		}while (true);
		
		return num;
	}
}
