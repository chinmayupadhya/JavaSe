package first;

public class MyThread extends Thread {
	
	public void  run() {
		String str="a";
		for (int i = 0; i < 11; i++) {
			
			
			System.out.println("Alphabet:"+(char)(str.charAt(0)+i));
			
		}
		
	}
	
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.start();
		t2.start();
	}

}
