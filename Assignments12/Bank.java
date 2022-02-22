package Assignments12;

public class Bank extends SBI implements CIBIL,PNB {

	//PNB
	public void creditScore() {
		System.out.println("Your Credit Score is: 5.9");
		
	}

	//PNB
	public void minimumBalance() {
		System.out.println("Your Minimum Balance is: 10000");
		
	}
	
	//CIBIL
	public void cibilScore() {
		System.out.println("Your CIBIL Score is: 6.5");
		
	}

	//SBI
	public void bankBalance() {
		System.out.println("Your Bank Balance is: 5000");
		
	}

	//SBI
	public void maximumLoanAmount() {
		System.out.println("Your maximum Balance is: 50000");
		
	}
	public static void main(String[] args) {
		//using single object
		Bank gain=new Bank();
		gain.bankBalance();
		gain.cibilScore();
		gain.creditScore();
		gain.ITLoan();
		gain.maximumLoanAmount();
		gain.minimumBalance();
	}	
}

  //If creating a multiple object 
		/*SBI get=new Bank();
			get.ITLoan();
			get.maximumLoanAmount();
			get.bankBalance();
			
		PNB get1=new Bank();
			get1.creditScore();
			get1.maximumLoanAmount();
			get1.minimumBalance();
			
		CIBIL get2=new Bank();
			get2.cibilScore();
		*/
