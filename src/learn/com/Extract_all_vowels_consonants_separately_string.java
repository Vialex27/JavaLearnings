package learn.com;

public class Extract_all_vowels_consonants_separately_string {

	public static void main(String[] args) {


		String str1 ="Rashmika visvanath";
		String str = str1.replace(" ", "");
		
		String input = str.toLowerCase();
		
		String consonant="";
		String vowels ="";
		
		
		for(int i =0;i<=input.length()-1;i++) {
			
			char ch = input.charAt(i);
			
			if(ch =='a' || ch =='e'|| ch =='i' || ch =='o' || ch =='u')
			{
				
				vowels = vowels + ch;
			}
			
			else
			{
				consonant=  consonant + ch;	
			}
			
		}
		
		System.out.println("consonant word: " + consonant);

		System.out.println("vowels word: " + vowels);
		
		
	}
}
