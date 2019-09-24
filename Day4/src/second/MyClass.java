package second;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyThread o = new MyThread();
			Thread t1 = new Thread(o);
			Thread t2 = new Thread(o);
			t1.start();
			t2.start();
	}

}
