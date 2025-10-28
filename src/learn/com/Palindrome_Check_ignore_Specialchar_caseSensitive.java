package learn.com;

public class Palindrome_Check_ignore_Specialchar_caseSensitive {

	public static void main(String[] args) {


		String str = "A man, a plan, a canal: Panama#";
		String input = str.toLowerCase();
		String newWord ="";

		for(int i = 0; i<=input.length()-1;i++ ) {			
			char ch =	input.charAt(i);

			//This condition ensures only letters (A–Z, a–z) and digits (0–9) are considered.
			//All special characters (like space, comma, punctuation, symbols) fail the condition, 
			//so they are skipped — never added to newWord.

			if( (ch>= 'A' && ch<= 'Z' ||   ch>= 'a' && ch<= 'z' || ch>= '0' && ch<= '9') )
			{
				newWord = newWord + ch;
			}			
		}

		System.out.println("neword: " + newWord);

		
		String revword= "";
		for(int j =newWord.length()-1;j>=0;j--) {

			revword = revword +	newWord.charAt(j);
		}

		System.out.println("revword: " + revword);


		if(revword.equals(newWord))
		{
			System.out.println("given word is  palindrome");
		}

		else
		{

			System.out.println("not an palindrome");
		}

	}


}
