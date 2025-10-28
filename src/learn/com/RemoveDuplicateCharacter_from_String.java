package learn.com;

public class RemoveDuplicateCharacter_from_String {

	public static void main(String[] args) {
		
		String given ="Automation";
		String str = given.toLowerCase();
		
		String result ="";
		
		for(int i=0;i<=str.length()-1;i++) {
			
		char ch =str.charAt(i);
		String v = String.valueOf(ch);
		
		if(result.contains(v)) {
			continue;
		}

		else {
			result = result + v;
		}
		
		}
		
		System.out.println(result);
		
		
		

	}

}
