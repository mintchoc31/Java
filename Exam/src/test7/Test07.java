package test7;

class BaseBallPlayer implements Player {
	@Override
	public void play() {
		System.out.println("야구를 합니다.");
	}
}
class FootBallPlayer implements Player {
	@Override
	public void play() {
		System.out.println("축구를 합니다.");
	}
}
public class Test07 {
	public static void main(String[] args) {
//player	??? p1 = new BaseBallPlayer(); 	
//player	??? p2 = new FootBallPlayer();
		
		playGame(p1);
		playGame(p2);
	}
	
	public static void playGame() {
		p.play();
	}
}
