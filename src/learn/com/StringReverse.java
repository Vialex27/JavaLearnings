package learn.com;

public class StringReverse {

	public static void main(String[] args) {

		String str ="visva";
		String rev ="";
		//		
		//		for(int i = str.length()-1; i>=0; i--) {
		//			
		//		rev = rev +	str.charAt(i);
		//			
		//		}
		//
		//		System.out.print(rev);

		// another type:

		char[] arr=	str.toCharArray();

		for(int i = arr.length-1;i>=0;i--)
		{

			rev = rev + arr[i];
		}

		System.out.println(rev);

		
	}
}
