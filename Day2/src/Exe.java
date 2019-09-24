import java.io.IOException;

public class Exe {
	int i=0;
	public void disp() throws IOException {
		
		System.out.println("disp1");
		if (i==0) {
			throw new IOException();
		}
	}
	public void disp2(){
		System.out.println("disp2");
			if (i==0) {
				throw new RuntimeException();
			}
	}
	
	public static void main(String[] args) {
		Exe e=new Exe();
		try {
			
			e.disp();
			
			
		} catch (Exception e2) {
			// TODO: handle exception
			System.out.println(e);
		}
		try {
			e.disp2();
		} catch (Exception e2) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	
		
	}

}
