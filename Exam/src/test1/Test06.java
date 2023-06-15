package test1;

import java.util.Scanner;
import java.util.scanner;

/*
 * 날짜: 2023/06/13
 * 이름: 조유빈
 * 내용: 자바 자료형 연습문제
 */
public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x값 입력 : ");
		int x = sc.nextInt();
		
		System.out.println("y값 입력 : ");
		int y = sc.nextInt();
		
		        = x > y ? "X가 더 큽니다." : "y가 더 큽니다.";
		
		System.out.println(result);
	}
}
