package second;

import java.util.*;
import java.util.Map.Entry;

public class Student {
	String studentname;
	int prn_no;
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getPrn_no() {
		return prn_no;
	}
	public void setPrn_no(int prn_no) {
		this.prn_no = prn_no;
	}
	
	public static void main(String[] args) {
		Map<Integer,String> m= new HashMap<Integer,String>();
		
		Scanner sc =new Scanner(System.in);
		Student[] student = new Student[1];
		for (int i = 0; i < student.length; i++) {
			student[i]=new Student();
			System.out.println("Enter prn_no for student"+i);
			student[i].setPrn_no(sc.nextInt());
			System.out.println("Enter name for student"+i);
			student[i].setStudentname(sc.next());
			m.put(student[i].getPrn_no(), student[i].getStudentname());
			
		}
		m.forEach(
				(k,v)->{
					System.out.println( "The Student prn no:---"+k+ " \nThe Student Name:---"+v);
				}
				
				
				);
		
		
		/*Set s=m.entrySet();
		Iterator i=s.iterator();		
		while (i.hasNext()) {
			Map.Entry<Integer, String> e=(Entry<Integer, String>) i.next();
			System.out.println("Student Prn_no"+e.getKey()+"Student Name"+e.getValue());
		
		}*/
		
	}

}
