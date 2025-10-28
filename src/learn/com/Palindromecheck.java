package learn.com;

import java.util.Scanner;

public class Palindromecheck {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the string");

		String str = scan.nextLine();	
		
		String rev ="";

		for(int i = str.length()-1;i>=0;i--)
		{
			rev = rev  + str.charAt(i);
		}
		System.out.println(rev);


		if(rev.equals(str))
		{
			System.out.println("Given input is palindrome");
		}

		else {

			System.out.println("It is not palindrome");
		}

	}

}
