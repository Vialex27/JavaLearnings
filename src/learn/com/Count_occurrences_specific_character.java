package learn.com;

public class Count_occurrences_specific_character {

	public static void main(String[] args) {


		String str1 ="Nehaanaahhhee";
		
		String str = str1.toLowerCase();
		
		char c = 'e';
		
		int count =0;
		
		for(int i =0;i<=str.length()-1;i++) {
			
		char ch =	str.charAt(i);
			
			if(ch==c) {
				count++;
				
			}
			
		}
		
		System.out.println("Total count " + count);
		
				

	}

}
