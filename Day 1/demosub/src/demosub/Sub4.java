package demosub;

public class Sub4 extends Base4{
	private int number1;
	private int number2;
	

	public Sub4() {//default constructor
		super(5);
	}
	
	public Sub4(int number1) {//parameterized constructor with one parameter
		super(15);
		this.number1 = number1;
	}

	public Sub4(int number1, int number2) {//parameterized constructor with two parameter
		super();
		this.number1 = number1;
		this.number2 = number2;
	}

	
	
	public int getNumber1() {
		return number1;
	}

	public int getNumber2() {
		return number2;
	}

	public static void main(String[] args) {
	
		Sub4 sub = new Sub4();
		Sub4 sub1 = new Sub4(35);
		Sub4 sub2 = new Sub4(25,30);
		System.out.println(sub.getNumber()+"/ "+sub.getNumber1()+" /"+ sub.getNumber2());
		System.out.println(sub1.getNumber()+"/ "+sub1.getNumber1()+" /"+ sub1.getNumber2());
		System.out.println(sub2.getNumber()+"/ "+sub2.getNumber1()+" /"+ sub2.getNumber2());
		
		

	}

}
