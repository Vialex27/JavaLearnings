package learn.com;

public class SentenceReverse {

	public static void main(String[] args) {
		
		String str ="Hi ram how are you";
	String[] arr =	str.split(" ");
		
				String rev =" " ;
				
				for(int i = arr.length-1; i>=0; i--) 
				{				
				rev = rev +	arr[i] + " ";				
					
				}
				
						
				System.out.print("rev sentence: " + rev );
				
				

	}

}
