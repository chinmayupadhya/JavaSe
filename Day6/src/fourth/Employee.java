package fourth;

import java.io.*;

public class Employee implements Serializable {
	int empid;
	String empname;
	String desig;
	String basic;
	
	
	public Employee(int empid, String empname, String desig, String basic) {
		this.empid = empid;
		this.empname = empname;
		this.desig = desig;
		this.basic = basic;
	}
	
	
	public void disp() {
		System.out.println("Employee Id : "+empid);
		System.out.println("Employee Name : "+empname);
		System.out.println("Employee Designation: "+desig);
		System.out.println("Employee Basic : "+basic);
	}
}
