package Assignment7;

public class CharacterOccurance {
	public static void main(String[] args) {
		String input ="Welcome to chennai";
		int count=0;
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i)=='e') {
				count++;
			}
		}
		System.out.println(count);
	}

}
