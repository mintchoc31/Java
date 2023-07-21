package test8;

@FunctionalInterface
interface NumericLamda {
	boolean test(int n);
}

public class Test05 {
	public static void main(String[] args) {
		
		NumericLamda isEven = ???
				
		if(isEven.test(2)) {
			System.out.println("2는 짝수");
		}
		
		if(!isEven.test(3)) {
			System.out.println("3은 짝수 아님");
		}
		
		NumericLamda isNonNeg = ???
		
		if(isNonNeg.test(1)) {
			System.out.println("1은 양수");
		}
		
		if(!isNonNeg.test(-1)) {
			System.out.println("-1은 음수");
		}

	}
}
