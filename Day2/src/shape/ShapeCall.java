package shape;

public class ShapeCall {

	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.setHeight(15);
		shape.setWidth(21);
		System.out.println(shape.getHeight()+","+shape.getWidth());
	}

}
