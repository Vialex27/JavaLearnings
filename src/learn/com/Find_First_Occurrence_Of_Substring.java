package learn.com;

public class Find_First_Occurrence_Of_Substring {


	public static void main(String[] args) {

		//		 String str = "learnjavafromjavaexamples";
		//	        String sub = "java";
		//	        
		//	        
		////	        int index = str.indexOf(sub);
		////	        if( index != -1)
		////	        {
		////	        	System.out.println("occurance of sub index is: " + index );
		////	        }

		//another method

		String str = "learnjavafromjavaexamplesjava";
		String sub = "java";

		int count = 0;  // to count total occurrences

		System.out.println("All occurrences of '" + sub + "' in the string:");

		// Loop through each possible starting position
		for (int i = 0; i <= str.length()-sub.length(); i++) {

			int j; // to track matching characters

			//Inner Loop — Compare Each Character
			// Compare substring manually, character by character

			
			//j starts at 0 and increments for every matching character.
			//If a character mismatch occurs → break → inner loop stops early.

			
			//j < sub.length() is false → inner loop ends
			
			for (j = 0; j < sub.length(); j++)
			{
				//“Not equal to” – means mismatch so break.. 
				//If they don’t match, stop comparing further (break).
				if (str.charAt(i + j) != sub.charAt(j)) {
					break; // mismatch found
				}
			}
		//	The if condition checks for mismatch.

		//	If mismatch → break the loop (stop checking that position).

		//	If the inner loop completes without breaking → all characters matched → found a substring.

			//If all characters match → inner loop completes fully, so j reaches sub.length().
			// if inner loop completed fully => match found

			//   Loop finishes → j = 4 → which is sub.length() confirms full match of substring at position

			if (j == sub.length()) {
				System.out.println("Found at index: " + i);
				count++;
			}


		}

		if (count == 0) {
			System.out.println("'" + sub + "' not found in the string.");
		} else {
			System.out.println("Total occurrences: " + count);
		}


	}

}
