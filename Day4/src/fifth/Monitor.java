package fifth;

public class Monitor {

	int i = 51;
	boolean value_set;
	int token;

	synchronized public void set(int ii) {
		while (value_set) {
			try {

				wait();

			} catch (InterruptedException ie) {
			}
		}
		System.out.println("Producer" + ii);

		token = ii;
		notifyAll();
		value_set = true;
	}

	synchronized public void get() {
		while (!value_set) {
			try {
				wait();

			} catch (InterruptedException ie) {
			}
		}

		value_set = false;
		int k = i - token;
		System.out.println("Consumer  " + k);
		
		notifyAll();

	}
}
