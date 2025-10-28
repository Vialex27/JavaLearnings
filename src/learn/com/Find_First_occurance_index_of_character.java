package learn.com;

public class Find_First_occurance_index_of_character {

	public static void main(String[] args) {
			
		String str ="jravalearn";
		
		char findCharacter = 'a';
		
		int index= -1;
		
	int result =	str.indexOf(findCharacter);
	System.out.println(result);
		
		for(int i=0;i<=str.length()-1;i++)
		{	
			if(str.charAt(i)==findCharacter)
			{
				index =i;
				break;
				
			}
	
		}
		
		
		if(index != -1)
		{
			System.out.println("first occurance character is :" +index);
			
		}
		else {
			
			System.out.println("no character found");
		}

	}

}
