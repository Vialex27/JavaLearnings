package learn.com;

import java.util.*;

public class Replace_word_given_sentence {

	public static void main(String[] args) {

		String str1 ="Hi visva how are you";
		
		String[] str = str1.split(" ");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the oldword to be replace ");
		String removeword =	scan.nextLine();
		
	
		String result="";

		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the newword to be replace ");
		String newWord =	scan1.nextLine();
		
		
		for(String x: str)
		{
			
			if(x.equals(removeword))
			{
				result = result + newWord +" ";
				
			}
			
			else
		    {
		        result = result + x + " ";
		    }
			
			
		}
		
		System.out.println(result);


	}

}
