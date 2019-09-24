package fifth;

public class Batsman {
	protected String batsman_name;

	public String getBatsman_name() {
		return batsman_name;
	}

	public void setBatsman_name(String batsman_name) {
		this.batsman_name = batsman_name;
	}

	@Override
	public String toString() {
		return batsman_name;
	}
	

}
