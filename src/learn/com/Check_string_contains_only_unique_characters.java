package learn.com;

import java.util.LinkedHashSet;

public class Check_string_contains_only_unique_characters {

	public static void main(String[] args) {
		
		
		String str1 = "Helo World";
		String str =	str1.toLowerCase();
		String tmp = str.replace(" ", "");
		
		LinkedHashSet<Character> uniqueChar = new LinkedHashSet<Character>();
	
		boolean flag = true;
		
		for(int i =0;i<=tmp.length()-1;i++)
		{
			char ch =tmp.charAt(i);

			if(uniqueChar.add(ch)==false) {		
				flag = false;
				break;
			}
			
		}
			
			if(flag == true) {				
				System.out.println("It contains unique character");
			}
			else
			{

				System.out.println("It contains no unique character");
			}


	}

}
