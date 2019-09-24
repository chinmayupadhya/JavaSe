package first;

public class GamesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game[] game = new Game[3];
		game[0]=new Cricket();
		game[1]=new Football();
		game[2]=new Tennis();
		for (Game game2 : game) {
			if (game2 instanceof Cricket) {
				game2.play();
				
			}
		}
		

	}

}
