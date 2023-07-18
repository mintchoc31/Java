package test5;

public class Test05 {
	public static void main(String[] args) {
		
		int price = 187000;
		
		// 나누고 남은 값을 계속해서 나눌 수 있게 만들어야함
		
		int won50000 = price / 50000; 
		int won10000 = price  % 50000/ 10000;
		// % 50000 : 50000으로 나눈 나머지 구하기
		int won5000 = price % 10000/ 5000; 
		int won1000 = price % 5000 / 1000;
		
		
		System.out.println("5만원권 : " + won50000 + "장");
		System.out.println("1만원권 : " + won10000 + "장");
		System.out.println("5천원권 : " + won5000 + "장");
		System.out.println("1천원권 : " + won1000 + "장");
	}
}
