package learn.com;

public class Check_one_string_rotation_of_another {

	public static void main(String[] args) {
	
		String s1="abcd";  
		String s2="cdab";
		
		String s3 = s1+s1;
		
		if(s1.length()!= s2.length())	{
			System.out.println("not an rotation");
			System.exit(0);
	
		}
		
		if(s3.contains(s2)) {
			
			System.out.println("Is an rotation");
		}
		
		else {
			System.out.println("It not an rotation ");
		}
	}

}
