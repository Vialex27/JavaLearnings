package learn.com;

import java.util.Arrays;
import java.util.TreeSet;

public class Two_strings_are_anagrams {

	public static void main(String[] args) {
		String str1 =	"listen";
		String str2= "silent";


		if(str1.length() != str2.length())

		{
			System.out.println("Given word is not anagrams");
		}

		char[] arr1 = str1.toCharArray();
		char[] arr2 = 	str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		System.out.println(arr1);
		System.out.println(arr2);
		
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("Given word is  anagrams");
		}
		else
		{
			
			System.out.println("Given word is not anagrams");
		}
		
	
	}

}
