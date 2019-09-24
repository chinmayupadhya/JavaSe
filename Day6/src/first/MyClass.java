package first;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class MyClass implements Serializable {

	String string;

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	@Override
	public String toString() {
		return "MyClass [string=" + string + "]";
	}

	public static void main(String[] args) {
		String filename = "D:\\VITA\\JAVA\\Java_Workspace\\Assigments\\Day6\\src\\first\\myfile.txt";// file location
		Scanner sc = new Scanner(System.in);
		List<MyClass> list = new ArrayList<MyClass>();
		MyClass[] myclass = new MyClass[5];
		for (int i = 0; i < 3; i++) {
			myclass[i] = new MyClass();
			String s = sc.next();
			myclass[i].setString(s);
			list.add(myclass[i]);
		}

		// System.out.println(list);

		try (FileOutputStream fos = new FileOutputStream(filename);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {

			oos.writeObject(list);

		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try (FileInputStream fis = new FileInputStream(filename); ObjectInputStream ois = new ObjectInputStream(fis)) {
			List<?> lst =  (ArrayList<?>) ois.readObject();
			lst.stream().forEach((e)->{System.out.println(((MyClass) e).getString());});
		
			//System.out.println(lst);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
