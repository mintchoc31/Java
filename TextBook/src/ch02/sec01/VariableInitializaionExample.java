package ch02.sec01;

/*
 * 날짜:2023/06/16
 * 이름:조유빈
 * 내용:
 */

public class VariableInitializaionExample {
	public static void main(String[] args) {
		
	//37p 1번
		// 변수 value 선언
		int value;
		
		// 연산 결과를 변수 result의 초기값으로 대입
		int result = value + 10;   
		// value에 빨간 밑줄은 컴파일 오류 : value 값 초기화되지 않음.
		
		// 변수 result의 값을 읽고 콘솔에 출력
		System.out.println(result);
	
	}
}
