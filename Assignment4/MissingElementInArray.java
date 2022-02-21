package Assignment4;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 6, 7};
		
        Arrays.sort(numbers);
        
        for (int i = 0; i <=numbers.length; i++) {
        	
        	System.out.println(numbers[i]);
        	
           if(i+1!=numbers[i]) {

        	   System.out.println(i+1);
        	   break;
           }   
        }
    }       
}
