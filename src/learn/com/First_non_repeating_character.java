package learn.com;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class First_non_repeating_character {

	public static void main(String[] args) {

		String str1 = "vaisvai";
		char[] str = str1.toCharArray();
		
		LinkedHashMap<Character, Integer> hp = new LinkedHashMap<Character, Integer>();

		for(int i =0; i<=str.length-1;i++)
		{
			char ch =	str[i];
			
			if(hp.containsKey(ch))
			{
			int count =	hp.get(ch);
			hp.put(ch, count+1);
			}
			else {
				
				hp.put(ch, 1);
		}
				
		}
		System.out.println(hp.entrySet());
		
		
		for(Entry<Character, Integer> x : hp.entrySet())
		{
			if(x.getValue()== 1)
			{
				System.out.println("First non repeating character: " + x.getKey());
				break;
				
			}
			
			
		}

		
		
	}
	}
