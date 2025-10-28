package learn.com;

public class Remove_specific_character_from_string {


	public static void main(String[] args) {

		String str ="hidjcdsh#@@";

		//	String letterChar ="";
		//	String splChar ="";
		//	
		//	for(int i =0; i<=str.length()-1; i++) {
		//		
		//		char ch = str.charAt(i);
		//		
		//		if(Character.isLetter(ch))
		//		{
		//			letterChar = letterChar + ch;
		//			
		//		}
		//		
		//		else
		//		{
		//			
		//			splChar =splChar+ ch ;
		//		}
		//	}
		//	
		//	System.out.println("After removing spl character: " + letterChar );
		//	

		//anotheer method:
		
		String finalW ="";
		
		for(int i =0; i<=str.length()-1; i++) {

			char ch = str.charAt(i);

			if(ch>='a' && ch<= 'z' || ch>='A' && ch<= 'z' )
			{
				
				finalW = finalW + ch;
			}
			
		}
		
		System.out.println(finalW);


		}

	}
