package fifth;

public class MyClass {
	public static void main(String[] args) {
		Monitor m = new Monitor();
		MyThread add = new MyThread(m);
		MyConsume remove = new MyConsume(m);
		Thread t1 = new Thread(add);
		Thread t2 = new Thread(remove);
		t1.start();
		t2.start();
	}

}
