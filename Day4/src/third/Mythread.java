package third;

public class Mythread extends Thread {
	
	public void run() {
		for (int i = 0; i < 6; i++) {
			System.out.println("Exec"+i);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread t1 = new Mythread();
		Mythread t2 = new Mythread();
		Mythread t3=new Mythread();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
