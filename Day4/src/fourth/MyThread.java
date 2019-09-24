package fourth;

public class MyThread implements Runnable {
		
	public static void meth() {
		synchronized (MyThread.class) {
			for (int i = 1; i <=10; i++) {
				System.out.println(i);
				
		}
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
		meth();
		
	}

}
