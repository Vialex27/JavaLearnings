package learn.com;

public class Convert_string_uppercase_and_lowercase {

	public static void main(String[] args) {

		//// convert to uppercase
		String str = "vIsva";	
		String result ="";

		for(int i =0;i<=str.length()-1;i++)
		{

			char ch =	str.charAt(i);

			
			if(ch >= 'a' && ch<= 'z') {
				
				ch= (char) (ch - 32);
				
			}
			

			result = result + ch;
		}
		
		
		System.out.println(result);

		//// convert to lowercase
		String str1 = "AZaz";	
		String result1 ="";

		for(int i =0;i<=str1.length()-1;i++)
		{

			char ch =	str1.charAt(i);
			
			if(ch >='A' && ch<= 'Z')
			{
				ch= (char) (ch + 32);

			}

			result1 = result1 + ch;
		}
		System.out.println(result1);

	}

}
