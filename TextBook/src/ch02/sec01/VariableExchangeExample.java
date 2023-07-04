package ch02.sec01;

public class VariableExchangeExample {
	public static void main(String[] args) {
		
		//38p
			int x = 3;
			int y = 5;
			System.out.println("x : " + x + "y : " + y);
			
			int temp = x;
			x = y;
			y = temp;
			System.out.println("x : " + x + ", y :" + y);  
			// println 괄호 안의 구성 다시 보기 - x:/3/, y:/5
	}
}
