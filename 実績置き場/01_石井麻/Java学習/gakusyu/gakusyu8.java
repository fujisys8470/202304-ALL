package gakusyu;

public class gakusyu8 {
	public static int main(){
		int sum = 0;
		
		for (int i = 1; ; i++){
			sum += i;
			if (sum > 5){
				break;
			}
		}
		
		return sum;
	}
}
