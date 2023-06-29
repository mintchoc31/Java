package ch02;

/*
 * 날짜:2023/06/16
 * 이름:조유빈
 * 내용:
 */

public class Sec01 {
	public static void main(String[] args) {
		
	//37p 1번
		// 변수 value 선언
		int value;
		
		// 연산 결과를 변수 result의 초기값으로 대입
		//int result = value + 10;   // value에 빨간 밑줄은 컴파일 오류 : value 값 초기화되지 않음.
		
		// 변수 result의 값을 읽고 콘솔에 출력
		//System.out.println(result);
		
	//37p 2번
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총" + totalMinute + "분");
		
	//38p
		int x = 3;
		int y = 5;
		System.out.println("x : " + x + "y : " + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x : " + x + ", y :" + y);  // println 괄호 안의 구성 다시 보기 - x:/3/, y:/5
	}
}
