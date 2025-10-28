package learn.com;
import java.util.*;
import java.util.Map.Entry;

public class Frequency_of_character_in_string_digit_specialCase {

	public static void main(String[] args) {
		String str1 = "Hello World 123!!! Java@2025";
		String str = str1.toLowerCase();
		
		String tmp = str.replace(" ", "");
		
		int lettercount=0 ;
		int digitcount=0 ;
		int specialcasecount=0;
		
		
		LinkedHashMap<Character, Integer> hp = new LinkedHashMap<Character, Integer>();
		
		for(int i =0;i<=tmp.length()-1;i++)
		{
			char ch = tmp.charAt(i);
			if(Character.isDigit(ch))
			{
				
				digitcount++;
			}
			else if(Character.isLetter(ch)) {
				lettercount++;
				
			}
			else {
				specialcasecount++;
			}
			

			 if(hp.containsKey(ch)) 
				{
					
				int count =	hp.get(ch);
				hp.put(ch, count +1);
				}
				
				else {
					
					hp.put(ch, 1);
				}
				
			}
		
		System.out.println("Entry set: " + hp.entrySet());
		
		for(Entry<Character, Integer> x: hp.entrySet())
		{
			
			System.out.println(x.getKey() + " =" + x.getValue());
		}
		
		System.out.println("Total digitcount: " + digitcount);
		System.out.println("Total specialcasecount: " + specialcasecount);
		System.out.println("Total lettercount: " + lettercount);
		
		}		
	}
