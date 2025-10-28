package learn.com;

import java.util.LinkedHashSet;


public class Find_uncommon_characters_between_two_strings {

	public static void main(String[] args) {
		
		String str1 ="visvaram";
		String str2 ="visvanath";
		
		LinkedHashSet<Character> set1 = new LinkedHashSet<Character>();
		
		for(char x: str1.toCharArray())
		{
			set1.add(x);
			
		}
				
		LinkedHashSet<Character> set2 = new LinkedHashSet<Character>();	
				
		for(char x: str2.toCharArray())
		{
			set2.add(x);
		}
		
		LinkedHashSet<Character> unique = new LinkedHashSet<>();

		for(char c: set1) {
		if(set2.contains(c)==false)
		{
			unique.add(c);
		}
		}
		
		for(char c: set2) {
			if(set1.contains(c)==false)
			{
				unique.add(c);
			}
			}
		
		
		System.out.println("unique charcater is " + unique);
	}

}
