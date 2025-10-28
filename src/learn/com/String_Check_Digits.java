package learn.com;

public class String_Check_Digits {

	public static void main(String[] args) {
		String str = "vjhgfd";

		//	if(str.matches("\\d+"))  use to check for all digit
		
//		if(str.matches(".*\\d.*")  )  //to check atleast only one digit
//		
//		{
//
//			System.out.println("contains digit");
//
//		}
//
//		else {
//
//			System.out.println("no digit");
//		}


		
		//Another method	
	char[] arr =	str.toCharArray();
	boolean flag = false;
	for(Character x: arr )
	{
	
		if(Character.isDigit(x))
		{
			flag = true;
			break;
		}
	
	}
	
	if(flag== true)
	{
		System.out.println("contains digit");
		
	}
	else
	{
		
		System.out.println("No digit");
	}
	
	
	
	
	}

}
