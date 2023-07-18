package test4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * 날짜: 2023/06/30
 * 이름: 조유빈
 * 내용: 로또번호 연습문제
 */
public class Test09 {
	public static void main(String[] args) {
		
		for(int count=1; count <=5; count++) {
			System.out.println(makeLotto());
		}
	}
				 //Set<Integer>
	public static ??? makeLotto() {
		
		Set<Integer> lottoSet = new HashSet<>();
		// 무한 반복
		for(;;) {
					//(int) Math.ceil(Math.random() * 45);
			int num = ???
					// add(num);
			lottoSet.???
					
			if(lottoSet.size() == 6) {
				break;
			}
		}
		
		// 정렬
		set<Integer> treeSet = new TreeSet<>(lottoSet);
		
		return treeSet;
	}
}
