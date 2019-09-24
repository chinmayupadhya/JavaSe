package fifth;

import java.util.*;

public class MyClass {
	public static void main(String[] args) {
		Batsman[] b = new Batsman[5];
		Map<Integer, String> m = new HashMap<Integer, String>();
		Scanner sc = new Scanner(System.in);
		int i = 0;
		for (int j = 0; j < b.length; j++) {
			b[j] = new Batsman();
			System.out.println("Enter The Batsman Name \n");
			b[j].setBatsman_name(sc.next());
			System.out.println("Enter Its Ranking \n");
			m.put(sc.nextInt(), b[j].getBatsman_name());
			
		}
		System.out.println("Enter The Rank: \n");

		String str = m.get(sc.nextInt());
		if (str != null) {
			System.out.println("Batsmen Is " + str+"\n");
		} else
			System.out.println("Please Enter A Valid Rank \n");
		

	}	

}
