package second;

public class Calculator {

	public int calDouble(int i) throws MyArithException {
		if (i == 0) {
			throw new MyArithException("Zero not Allowed");
		} else if (i < 0) {
			throw new MyArithException("Negative Is Not Allowed");
		} else {
			return 2 * i;
		}
	}

}
