package Assignment7;
public class ReverseEvenWord {
	public static void main(String[] args) {
		String input= "Hi welcome to chennai";
		
		String[] words=input.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			
			if(i%2==1) {
				
				for (int j = words[i].length()-1; j >=0; j--) {
					
					System.out.print(words[i].charAt(j));
				}
				
				System.out.print(" ");
				
			}
			else {
				System.out.print(words[i]+" ");
			}
			
		}
	}

}