package Array;
//ARRAY OF OBJECTS;
public class DemoArr {
	int num;

	public DemoArr(int num) {
		this.num = num;
	}
	
	public void disp() {
		System.out.println(this.num);
		
	}
	
	
	public static void main(String[] args) {
		DemoArr demo[]=new DemoArr[3];
		demo[0]=new DemoArr(10);
		demo[1]=new DemoArr(20);
		demo[2]=new DemoArr(30);
		demo[0].disp();
		demo[1].disp();
		demo[2].disp();
	}
}
