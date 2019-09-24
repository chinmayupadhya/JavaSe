package Array;

//TO SORT A SINGLE DIMENSION ARRAY
public class Array {

	public static void main(String[] args) {
		int a[] = { 11, 2, 5, 87, 15 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 1+i; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
