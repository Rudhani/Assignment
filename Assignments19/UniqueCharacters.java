package Assignments19;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {

	public static void main(String[] args) {
		String input = "babub";
		
		Set<Character> dup = new HashSet<Character>();
		
		for(int i =0; i<=input.length()-1;i++ ) {
		dup.add(input.charAt(i));
		
		}
		String end = dup.toString();
		System.out.println(end);
		

	}

}
