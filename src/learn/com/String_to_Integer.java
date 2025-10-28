package learn.com;

public class String_to_Integer {

	public static void main(String[] args) {


		String given ="12345";

		//		int num =	Integer.parseInt(given);
		//		System.out.println(num);

		int num =0;

		for(int i=0;i<=given.length()-1;i++) {

			char ch =	given.charAt(i);

			if(ch >= '0' && ch<='9' ) 
			{
				//Checks whether ch is in the ASCII range for digits '0'..'9'. 
				//This prevents non-digit characters from being processed.

				num = num * 10 + (ch - '0'); //converts a character digit to its numeric value
				
				//(ch - '0') converts a character digit to its integer value because characters are stored as numeric codes.
				//Example: '5' has code 53, '0' is 48, so '5' - '0' = 5.

			}
			else {
				System.out.println("no digit");
				return;
			}



		}

		System.out.println("converted num : " + num);

	}

}
