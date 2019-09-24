package second;

import java.util.*;;

public class MyCalcApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer i = null;
		int input;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number To be Doubled");
		input = scanner.nextInt();
		try {
			i = new Calculator().calDouble(input);
		} catch (MyArithException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("The Value After Double Is: " + i);

	}

}
