package Assignment9;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("NOT override");
	}

	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		
		ab.deposit();
	}
}
