package test3;
/* 날짜: 2023/06/23
 * 이름: 조유빈
 * 내용: 인터페이스 연습문제
 */
interface Buyer {
	public void buy();
}

interface Seller {
	public void sell();
}

class Customers ? {
	
	@Override
	public void sell() {
		System.out.println("판매하기");
	}
	
	@Override
	public void buy() {
		System.out.println("구매하기");
	}
}

public class Test10 {
	public static void main(String[] args) {
		Buyer buyer = new ?
		Seller seller = new ?
				
		buyer.buy();
		seller.sell();
	}
}
