package Ch03;

public class Sec09s {
	public static void main(String[] args) {
		int value = 772; //[00000000] [00000000] [00000011] [00000100]
		
		// 우측으로 3byte(24bit) 이동하고 끝 1바이트만 읽음: [00000000]
		byte byte1 = (byte) (value >>> 24);
		int int1 = byte1 & 255;
		System.out.println("첫 번째 바이트 부호 없는 값: " + int1);
		
		byte
		int int2 = 
		
		
	}
}
