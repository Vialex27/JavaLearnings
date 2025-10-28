package learn.com;

import java.util.LinkedHashSet;

public class Find_Common_Characters_Between_Two_Strings {

	public static void main(String[] args) {

		String str1 ="visvaram";
		char[] arr1 =	str1.toCharArray();
		String str2= "visvanath";
		char[] arr2 = 	str2.toCharArray();


		//Store all characters of str1 in a HashSet
		LinkedHashSet<Character> hs1 = new LinkedHashSet<Character>();

		for(char ch : arr1)
		{
			hs1.add(ch);
		}

		//Now find common characters
		LinkedHashSet<Character> common = new LinkedHashSet<Character>();

		for(char ch: arr2)
		{
			if(hs1.contains(ch))
			{
				common.add(ch);	

			}			
		}

		System.out.println(common);

	}

}
