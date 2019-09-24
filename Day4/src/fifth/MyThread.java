package fifth;

public class MyThread implements Runnable {
	//For Produce
	Monitor ref;

	public MyThread(Monitor ref) {
		this.ref = ref;
	}
	
	public void produce() {
	
		for (int i = 1; i <=50; i++) {
			ref.set(i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		produce();
	}
	

}
