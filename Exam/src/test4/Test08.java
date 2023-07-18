package test4;

import java.util.Random;

/*
 * 날짜: 2023/06/30
 * 이름: 조유빈
 * 내용: 리스트 연습문제
 */
public class Test08 {
	public static void main(String[] args) {
		
		// 60 ~ 100 사이 임의의 수 10개를 더하므로 결과값이 항상 다름
		printlist(createList());
	}							//List<Integer>
	public static void printList(??? scoreList) {
		int total = 0;		 //size();
		int size = scoreList. ???
				
		for(int i=0; i<size ;  i++) {
								  //get(i);
			int score = scoreList. ???
					
			total += score;
			
			System.out.println(score);
			
			if(i == size - 1) {
				System.out.print(" = ");
			}else {
				System.out.print(" + ");
			}
		}
		System.out.println(total);
	}
				 //List<Integer>
	public static ??? createList(){
			//Integer
		List<???> scoreList = new ArrayList<>();
		Random rand = new Random();
		
		for(int i=1 ; i<=10 ; i++) {
			// 60 ~ 100사이 임의의 수
			int num = rand.nextInt(41) + 60;
					 //add(num);
			scoreList.???
		}
		
		return scoreList;
	}
}
