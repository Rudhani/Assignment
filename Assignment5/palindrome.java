package Assignment5;

public class palindrome {
	public static void main(String[]args) {
		String straight=new String ("Dad");
		
		String reverse=new String ("");
		
		for (int i = straight.length()-1; i>=0; i--) {
			
			System.out.println(straight.charAt(i));
			
			reverse=reverse+straight.charAt(i);
		}
		System.out.println(reverse);
		
		if(straight.equalsIgnoreCase(reverse)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
			
	}

}
