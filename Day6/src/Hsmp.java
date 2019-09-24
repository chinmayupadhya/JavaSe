import java.util.HashMap;

public class Hsmp {
	
	public static void main(String[] args) {
		String name ="aabbcdcdsdekf";
		
		
		HashMap<String,Integer> hsm=new HashMap<String, Integer>();
		for (int i = 0; i < name.length(); i++) {
			//char c;
			int valu=1;
			hsm.put(String.valueOf(name.charAt(i)),valu++ );
			
		}System.out.println(hsm.get("d"));
	}

}
