
public class All {
	Shape ref;

	public All(Shape ref) {
		this.ref = ref;
	}
	public Shape name() {
		return ref;
		
	}
	
	public static void main(String[] args) {
		All a = new All(new Triangle());
		Triangle t=(Triangle) a.name();//Here a.name() is returning the reference of Shape which is holding the object of triangle thats why we have to downcast it
		System.out.println(t);
	}
}
