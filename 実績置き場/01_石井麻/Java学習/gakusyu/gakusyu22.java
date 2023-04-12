package gakusyu;

public class gakusyu22 {
	public static int main(){
		int i = 0;
		
		while (i < 9){
			
			i++;
			if (i % 3 == 0){
				continue;
			}
			
			System.out.println("i = " + i);
		}

		System.out.println("End");
		return i;
	}
}
