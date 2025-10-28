package learn.com;

public class Compare_two_strings_without_using_equals {

	public static void main(String[] args) {

		String str1= "Visva";
		String str2 ="visva";

		//		if(str1.matches(str2)) {
		//			
		//			System.out.println("given two strings are equal");
		//		}
		//		
		//		else
		//		{
		//			
		//			System.out.println("given two strings are not equal");
		//		}
		//		

		String str =	str1.toLowerCase();
		String st = str2.toLowerCase();

		if(str.length()!= st.length()) {
			System.out.println("given string is not equal because of length very");
			return;
		}

		boolean flag = true;

		for(int i =0;i<=str.length()-1;i++)
			
		{
			if(str.charAt(i) != st.charAt(i)) {

				flag = false;
				break;
			}
		}


		if(flag == true) {
			System.out.println(" equal");
		}

		else if(flag == false) {
			System.out.println("not equal");
		}

	}
}
