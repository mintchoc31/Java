package test3;
/* 날짜: 2023/06/23
 * 이름: 조유빈
 * 내용: 다형성 연습문제
 */
class Product {
	
	?	String category;
	?	int price;
		
	public Product(String category, int price) {
		this.category = category;
		this.price = price;
	}
	public void ? () {}
}
class Television extends Product {
	
	public Television(String category, int price) {
		super(category, price);
	}
	
	@Override
	public void info() {
		System.out.println("제품분류" + category);
		System.out.println("제품가격" + price);
	}
}

class Computer extends Product {
	
	public Computer(String category, int price) {
		super(category, price);
	}
	
	@Override
	public void info() {
		System.out.println("제품분류" + category);
		System.out.println("제품가격" + price);
	}
}

public class Test08 {
	public static void main(String[] args) {
		
		? p1 = new Television("가전", 100);
		? p2 = new Computer("컴퓨터", 150);		
				
		p1.info();
		p2.info();
	}
}
