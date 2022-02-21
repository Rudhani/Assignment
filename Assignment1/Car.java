package Assignment1;

public class Car {
	
	
 public void carBreak() {
	 System.out.println("apply break");
 }
	 public void carGear() {
		 System.out.println("apply gear");
	 }
		 public void carAc() {
			 System.out.println("switch on Ac");
		 }
		 public void carAcclerate() {
			 System.out.println("apply Acclerate");
 }

	
 public static void main(String[] args) {
	
	 Car myCar=new Car();
	 
	 myCar.carBreak();
	 myCar.carGear();
	 myCar.carAc();
	 myCar.carAcclerate();
}
 
}