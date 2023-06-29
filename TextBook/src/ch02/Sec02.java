package ch02;

public class Sec02 {
	public static void main(String[] args) {
		int var1 = 0b1011;   //2진수. 0b 또는 0B로 시작.
		int var2 = 0206;	 //8진수. 0으로 시작. 0~7로 작성.
		int var3 = 365;		 //10진수	
		int var4 = 0xB3;     //16진수. 0x 또는 0X로 시작. 0 ~ 9 ~ A,B,C,D,E,F로 작성.
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		byte var6 = 128;	// 컴파일 에러(Type mismatch: cannot convert from int to byte). byte: -128 ~ 127.
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);

		long var1 = 10;
		long var2 = 20L;
		long var3 = 1000000000000;		//컴파일러는 int로 간주하기 때문에 에러 발생. l이나 L을 붙여 long 타입 값임을 알려줘야 함.
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
