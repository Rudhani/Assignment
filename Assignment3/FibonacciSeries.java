package Assignment3;

public class FibonacciSeries {
	
	public static void main(String[] args) {
	
		int n=8;
		
		int a=0;
		
		System.out.println(a);
		
		int b=1;
		
		System.out.println(b);
		
		for(int i=2;i<=n;i++) {

			int d=a+b; //c=0+1=1,1+1=2
			a=b;  //a=1
			b=d; //b=1
		
			System.out.println(d);
		}
	}


}
