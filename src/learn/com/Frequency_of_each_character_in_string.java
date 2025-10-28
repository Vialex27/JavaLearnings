package learn.com;
import java.util.*;
import java.util.Map.Entry;

public class Frequency_of_each_character_in_string {

	public static void main(String[] args) {

		String str1 = "Hello WoRld";

		String str = str1.toLowerCase();

		LinkedHashMap<Character, Integer> hp = new LinkedHashMap<Character,Integer>();

		for(int i =0; i<str.length();i++)
		{

			char ch =	str.charAt(i);

			if(ch ==' ')
			{
				continue;
			}

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

		for(Map.Entry <Character, Integer> x : hp.entrySet())
		{
			System.out.println(x.getKey() + "=" + x.getValue());

		}
	}

}
