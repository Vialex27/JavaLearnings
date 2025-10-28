package learn.com;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Find_Second_Most_Frequent_Character {

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


		System.out.println("Character frequencies: " + hp);
		System.out.println(hp.entrySet());

		System.out.println(hp.values());

		int firstMaxValue = 0;
		int secondMaxValue = 0;


		for(int x: hp.values())
		{
			if(x>firstMaxValue) {

				secondMaxValue=firstMaxValue;
				firstMaxValue = x;	
			}

			else if(x>secondMaxValue && x!=firstMaxValue)
			{
				secondMaxValue = x;	
			}
		}

		char secondMaxChar =' ';

		for(Entry<Character, Integer> y : hp.entrySet())
		{
			if(y.getValue()==secondMaxValue)
			{
				secondMaxChar =	y.getKey();

			}
		}



		System.out.println( secondMaxChar +" is second most frequently_occurring character in a given string for" + secondMaxValue+ " times");







	}

}
