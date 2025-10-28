
package learn.com;

public class Check_string_contains_only_alphabets {

	public static void main(String[] args) {


		String str ="aaa23";
		
		boolean flag = false;
		
		for(int i=0;i<=str.length()-1;i++)  {
			
			char ch =str.charAt(i);
			
			
			if(Character.isDigit(ch)==false ) {
				
				flag=true;
				break;
			}
			
		}

		if(flag==true)
		{
			System.out.println("not cotains only alphabett");
		}
		
		else {
			System.out.println(" only alphabet");
		}
		
		
	}

}
