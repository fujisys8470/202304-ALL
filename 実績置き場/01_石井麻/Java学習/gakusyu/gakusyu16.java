package gakusyu;

import java.util.Random;

public class gakusyu16 {
	public static int main(){
		int num;
		Random rand = new Random();
		
		System.out.println("6が出たら終わりです");
		
		do{
			num = rand.nextInt(6) + 1;
			System.out.println("no = " + num);
		}while (num != 6);
		
		return num;
	}
}
