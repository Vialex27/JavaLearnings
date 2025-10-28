package learn.com;
import java.util.*;

import java.util.Map;
import java.util.Map.Entry;

public class Count_Duplicate_Characters_with_Frequency {

	public static void main(String[] args) {
		String str1 = "Hello Worldd";
		String str = str1.toLowerCase();

		// Remove spaces
		String tmp = str.replace(" ", "");


		LinkedHashMap<Character, Integer> frequencyChar = new LinkedHashMap <Character, Integer>();
		LinkedHashMap<Character, Integer> duplicateCount = new LinkedHashMap<Character, Integer>();
		

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


		for(Entry<Character,Integer> x: frequencyChar.entrySet()) {

			if(x.getValue()>1)
			{
				duplicateCount.put(x.getKey(), x.getValue());
			}

		}

		System.out.println("duplicate characters cout");
		for(Entry<Character, Integer> y:duplicateCount.entrySet() )

			System.out.println(y.getKey() + " =" + y.getValue());



	}

}
