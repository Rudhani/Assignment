package Assignment3;

public class Calculator {
	public void multipleTwoNumbers(double a,double b) {
		System.out.println("multiple"+ " : "+a*b);
	}
	
	public void divideTwoNumber(float a,float b) {
		System.out.println("divide"+" : "+a/b);
	}
	
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.multipleTwoNumbers(20.3, 30.5);
		calc.divideTwoNumber(50.5f, 60.5f);
	}

}
