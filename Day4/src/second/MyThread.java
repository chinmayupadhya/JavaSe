package second;

public class MyThread implements Runnable {
	String str="a";
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Alphabet:"+(char)(str.charAt(0)+i));
		}
		
	}

}
