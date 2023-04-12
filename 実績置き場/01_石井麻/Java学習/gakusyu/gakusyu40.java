package gakusyu;

public class gakusyu40 {
	public static int[] main(){
		int data[];
		
		data = init();
		System.out.println(data[0]);
		System.out.println(data[1]);
		
		return data;
	}
	
	private static int[] init(){
		int data[] = new int[2];
		data[0] = 10;
		data[1] = 19;
		
		return data;
	}
}
