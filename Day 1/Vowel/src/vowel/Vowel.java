package vowel;

public class Vowel {
	
	String character;
	
	private void setCharacter(String character) {
		this.character = character;
	}
	private void display() {
		System.out.println("This is a vowel"+" "+this.character);
		
	}
	private void checkCharacter() {
		String string;
		switch(this.character) {
		case "a"  :
		case "A"  :
			display();
			break;
		case "e"  :
		case "E"  :
			display();
			break;
		case "i"  :
		case "I"  :
			display();
			break;
		case "o"  :
		case "O"  :
			display();
			break;
		case "u"  :
		case "U"  :
			display();
			break;
			default :
				System.out.println("Please Enter A Valid Vowel");
			
		}
		
		
		
	}

	
	public static void main(String[] args) {
		Vowel vowel = new Vowel();
		vowel.setCharacter("A");
		vowel.checkCharacter();
		
	}
}
