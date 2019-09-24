package fifth;

public class MyConsume implements Runnable {
		Monitor ref;
	public MyConsume(Monitor ref) {
			this.ref = ref;
		}
	public void consume() {
		for (int i = 0; i <= 50; i++) {
			ref.get();
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		consume();
	}

}
