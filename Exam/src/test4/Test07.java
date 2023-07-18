package test4;

public class Test07 {
	public static void main(String[] args) {
		
		Test07 test = new Test07();
		
		Apple apple = new Apple("한국", 3000);
		Banana banana = new Banana("필리핀", 2000);
		Grape grape = new Grape("미국", 3000);
		
		test.showInfo(apple);
		test.showInfo(banana);
		test.showInfo(grape);
	}
						//Fruit (X) Object 
	public void showInfo(??? fruit) {
				//instanceof
		if(fruit ??? Apple) {
						//(Apple)
			Apple apple = ??? fruit;
			apple.show();
					 //instanceof
		}else if(fruit ??? Banana) {
						  //(Banana)
			Banana banana = ??? fruit;
			banana.show();
					  //instanceof
		}else if(fruit ??? Grape) {
						//(Grape)
			Grape grape = ??? fruit;
			grape.show();
			
		}
	}
}
