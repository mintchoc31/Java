package test8;

public class Test02 {
	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "World";
		
		System.out.println("str1 역순 : " + reverseStr(str1));
		System.out.println("str2 역순 : " + reverseStr(str2));
	}
	
	public static String reverseStr(String str) {
	
		StringBuilder sb = new StringBuilder();
		
		for(int i = str.length() - 1 ; i >= 0 ; i--) {
			 sb.append(str.charAt(i)); // 주어진 문자열을 역순으로 만들기 위해 문자를 뒤에서부터 추가
        }
	
	
		return sb.toString();  // StringBuilder에 저장된 역순 문자열을 반환
	}
}
