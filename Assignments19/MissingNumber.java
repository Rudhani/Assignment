package Assignments19;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int[] numbers= {4,6,7,2,3,1,9,10,8,8,6};
		
		//creating new set
		Set<Integer> a = new TreeSet<Integer>();
		for(int i=0; i<numbers.length;i++){
			a.add(numbers[i]);	
		}

		//creating new list and storing set elements in list
		List<Integer> b = new LinkedList<Integer>();
		b.addAll(a);
		

		for(int i = 0; i<b.size()-1;i++) {
			
		int x = b.get(i+1)-b.get(i);
		
		       if(x!=1) {
		    	  System.out.println("The Missing Number is "+(b.get(i+1)-1));
		    	   }
		}
		} 

	}


