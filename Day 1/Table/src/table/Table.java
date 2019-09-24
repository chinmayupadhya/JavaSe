package table;



public class Table {
	
	private int number;
	
	public Table(int number) {
		this.number = number;
	}


	private void showTables() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i*this.number);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		Table table = new Table(5);
		table.showTables();
	}

}
