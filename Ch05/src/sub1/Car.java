package sub1;
/*
 * 날짜: 2023/06/19
 * 이름: 조유빈
 * 내용: 
 */

// Car 클래스 정의
public class Car {

	// 필드(속성) - 변수 선언
	String name;
	String color;
	int speed;
	
	// 메서드(기능)
	public void speedup(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량명 : " + this.color);
		System.out.println("차량명 : " + this.speed);
	}
}
