package learn.com;

import java.util.LinkedHashSet;

public class Find_uncommon_string_between_two_strings {

	public static void main(String[] args) {
		
		String[] fruit = {"apple","banana","orange", "grapes"};
		 String[] veg = {"tomato", "beans", "orange", "banana"};
		 
			LinkedHashSet<String> set1 = new LinkedHashSet<String>();	
			
			for(String x: fruit) {
				
				set1.add(x);
			}
			
			LinkedHashSet<String> set2 = new LinkedHashSet<String>();	
			
			for(String x: veg) {
				
				set2.add(x);
			}
			
			LinkedHashSet<String> unique = new LinkedHashSet<String>();	
			
		for(String c: set1) {
			
			if(set2.contains(c)==false) {
				
				unique.add(c);
			}
		}
		
		for(String c: set2) {
			
			if(set1.contains(c)==false) {
				
				unique.add(c);
			}
		}
		 
		System.out.println("unique word: " + unique);

	}

}
