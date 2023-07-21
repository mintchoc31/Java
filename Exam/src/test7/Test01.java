package test7;

class Box
{
	 private double width; 
	 private double height;
	 private double depth;
	 
	 /* 생성자 추가
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth; 
	}					
        getter 메서드 추가
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }							*/
	
 			 
	 // 부피를 계산하는 메서드
 	 public Box(double width, double height, double depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public ??? volume() // double
	 {
		 return width * height * depth;
	 }
}

public class Test01 {

	public static void main(String[] args) {
		Box box1 = new Box(1, 2, 3);
		Box box2 = new Box(3, 6, 9);
		
		System.out.println("box1 부피 : " + box1.volume());
		System.out.println("box2 부피 : " + box2.volume());
	}
}
