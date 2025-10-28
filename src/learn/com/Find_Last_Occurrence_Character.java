package learn.com;

public class Find_Last_Occurrence_Character {

	public static void main(String[] args) {
		
		
		String str ="javalearn";
		char findCharacter = 'r';
		int index= -1;
		
		for(int i=0;i<=str.length()-1;i++) {
			
			if(str.charAt(i)==findCharacter)
			{
				index =i;
				
			}
	
		}
		
		
		if(index != -1) {
			System.out.println("last occurance character is :" +index);
			
		}
		else {
			
			System.out.println("no character found");
		}

	}

}
