package fifth;

import java.util.*;
import java.util.Map.Entry;

public class Myclass1 {
	public static void main(String[] args) {
		Batsman[] b = new Batsman[1];
		Map<String, Integer> m = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		Integer i = 0;
		for (int j = 0; j < b.length; j++) {
			b[j] = new Batsman();
			
			System.out.println("Enter The Batsman Name:     ");
			b[j].setBatsman_name(sc.next().toLowerCase());
			System.out.println("Enter Its Ranking:   ");
			i=sc.nextInt();
			m.put(b[j].toString() , i);
			
		}
		m.forEach(
				(k,v)->{
					
					System.out.println(k+"   "+v);
				}
				
				);
				
		
		
		
		/*System.out.println("Enter name:-   ");
		String str=sc.next().toLowerCase();
		System.out.println("Enter Rank:   ");
		i=sc.nextInt();*/
		
	
		Set s=m.entrySet();
		Iterator<Entry<String, Integer>> itr=s.iterator();
		Map.Entry<String,Integer> entry;
		/*while (itr.hasNext()) {
			entry=itr.next();
			
			if (str.equals(entry.getKey())) {
				m.put(str, i);
				
			}
			
		}*/
			System.out.println("Enter Rank");
		  i=sc.nextInt();
		while (itr.hasNext()) {
			
				entry=itr.next();
				
				if (i.equals(entry.getValue())) {
					
					System.out.println(entry);
					
					
				}
			
		}

		

	}	

}
