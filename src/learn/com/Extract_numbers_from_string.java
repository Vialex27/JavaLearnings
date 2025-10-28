package learn.com;

public class Extract_numbers_from_string {

	public static void main(String[] args) {

		String str ="vis12345";	
		String num = "";

		for(int i =0;i<=str.length()-1;i++) {

			char ch =str.charAt(i);

			if(Character.isDigit(ch)) 
			{
				num = num + ch;

			}

		}
		System.out.println(num);

//		String str ="visva123456";		
//		String cha="";
//		for(int i =0;i<=str.length()-1;i++) {
//			char ch = str.charAt(i);
//			{			
//				if(ch>='0' && ch<= '9') {		
//					cha = cha + ch;
//					
//				}				
//			}
//		}
//		System.out.println(cha);



	}

}
