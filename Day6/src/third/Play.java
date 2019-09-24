package third;

public class Play<t extends Game> {
		t ref;
		
			public Play(t ref) {
			this.ref = ref;
		}
			public void play() {
				ref.play();
				
			}

			public static void main(String[] args) {
				Play<Game> tennis = new Play<Game>(new Tennis());
				Play<Game> football = new Play<Game>(new Football());
				Play<Game> hockey = new Play<Game>(new Hockey());
				Play hock = new Play(new Hockey());
				tennis.play();
				football.play();
				hockey.play();
				hock.play();
					
				
				
				
				
				
			}
}
