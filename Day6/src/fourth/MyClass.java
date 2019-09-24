package fourth;

import java.io.*;
import java.util.*;

public class MyClass {
	public static void main(String[] args) {
		String filename="D:\\VITA\\JAVA\\Java_Workspace\\Assigments\\Day6\\src\\fourth\\myfile.txt";
		
		List<Employee> lst=new ArrayList<Employee>();
		List<?> list=null;
		
		Scanner sc = new Scanner(System.in);
		
		Employee[] emp = new Employee[1];
		for (int i = 0; i < emp.length; i++) {
			System.out.println("Please Enter Employee Id,Employee Name,Employee Designation,Employee Basic for "+i+1+"st Employee");
			emp[i]=new Employee(sc.nextInt(),sc.next(),sc.next(),sc.next());
			lst.add(emp[i]);
		}
		
		
		try(FileOutputStream fos=new FileOutputStream(filename);ObjectOutputStream oos=new ObjectOutputStream(fos)) {
					oos.writeObject(lst);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(FileInputStream fis=new FileInputStream(filename);ObjectInputStream ois=new ObjectInputStream(fis)) {
			list= (ArrayList<?>)ois.readObject();
			list.stream().forEach(
					(e)->{
						((Employee) e).disp();
					}
					
					);//Lambda Expression For Not Using Iterator
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*Iterator i =list.iterator();
		while(i.hasNext()) {
			Employee e=(Employee)i.next();//To Print Using With Iterator
			e.disp();
		}*/
		
		
		
	}

}
