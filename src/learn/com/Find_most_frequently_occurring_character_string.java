package learn.com;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Find_most_frequently_occurring_character_string {

	public static void main(String[] args) {

		String str="visiaai";

		LinkedHashMap<Character, Integer> hp = new LinkedHashMap<Character, Integer>();

		for(int i =0;i<=str.length()-1;i++) {

			char ch =	str.charAt(i);

			if(hp.containsKey(ch)) 	{
				int count = hp.get(ch);
				hp.put(ch, count+1);		
			}

			else {
				hp.put(ch, 1);
			}

		}

		System.out.println(hp.entrySet());
		
		
		int max = 0;
		char result =' ';
		
		for(Entry<Character, Integer> x: hp.entrySet())
		{
			if(x.getValue()>=max) {
			
			max = x.getValue();	
			result=x.getKey();
			}
			
			
			
		}
		
		
		System.out.println(result+ " is most frequently_occurring character in a given string for " + max + " times");
		
		
		System.out.println(max);
		System.out.println(result);
		
		
		
		
	}
}
