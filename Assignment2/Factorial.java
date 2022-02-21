package Assignment2;

public class Factorial {
public static void main(String[] args) {
	int n=5;
	int c=1;
	for(int i=n;i>=1;i--) {
		c=c*i;
		System.out.println("Factorial given number is : "+c);
	}
}
}
