package learn.com;

import java.util.*;
import java.util.Map.Entry;

public class Duplicate_characters_in_string {

	public static void main(String[] args) {

		String str1 = "Hello Worlrdd";
		String str =	str1.toLowerCase();
		String tmp = str.replace(" ", "");
		
		LinkedHashSet<Character> uniqueChar = new LinkedHashSet<Character>();
		LinkedHashSet<Character> duplicateCha = new LinkedHashSet<Character>();


		for(int i =0;i<=tmp.length()-1;i++) {
			char ch =	tmp.charAt(i);

			if(uniqueChar.add(ch)==false) {			
				duplicateCha.add(ch);
			}

		}

		if(duplicateCha.isEmpty())			 		{
			System.out.println("No duplicate character");
		}

		else {		
			System.out.println("Duplicate character is: "+ duplicateCha );
		}

		System.out.println("After removal duplicate character is: "+ uniqueChar );

//using hasmap
		
LinkedHashMap<Character, Integer> frequencyChar = new LinkedHashMap <Character, Integer>();
        
        for(int i =0;i<=tmp.length()-1;i++) {
        	
        	char ch = tmp.charAt(i);
        	
        	if(frequencyChar.containsKey(ch))
        	{        			
        		frequencyChar.put(ch, frequencyChar.get(ch) + 1);
        	}
        	
        	else
        	{
        		frequencyChar.put(ch, 1);
        	}
        	
        }
        
        System.out.println("Frequence of characters : " + frequencyChar.entrySet());
        
        
        LinkedHashMap<Character, Integer> duplicateCount = new LinkedHashMap<Character, Integer>();
        
        for(Entry<Character,Integer> x: frequencyChar.entrySet()) {
        	
        	if(x.getValue()>1)
        	{
        		duplicateCount.put(x.getKey(), x.getValue());
        	}
        	
        }
        
        System.out.println("duplicate characters ");
        for(Entry<Character, Integer> y:duplicateCount.entrySet() )
        
        System.out.println(y.getKey());
        
        


	}
}
