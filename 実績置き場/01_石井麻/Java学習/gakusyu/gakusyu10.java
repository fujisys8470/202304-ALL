package gakusyu;

public class gakusyu10 {
	public static int main(){
		int i = 1;
		
		for (;;){
			System.out.println(i);
			i *= 3;
			if (i > 100){
				break;
			}
		}

		System.out.println(i);
		return i;
	}
}
