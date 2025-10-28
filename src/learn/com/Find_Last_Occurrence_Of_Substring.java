package learn.com;

public class Find_Last_Occurrence_Of_Substring {

	public static void main(String[] args) {

		String str="imjavainjava";
		String sub ="ja";
		
		int lastIndex = -1;
		
		
		for(int i =0;i<=str.length()-sub.length() ;i++) {
			
			int j;
			
			for(j =0; j<sub.length();j++) 
			{
				
				if(str.charAt(i+j) != sub.charAt(j))
				{
					break;
				}	
			}
			
			
			if(j ==sub.length()) {
				
				lastIndex= i;
				
			}
			
			
		}
		
		if(lastIndex != -1)
		{
		System.out.println(lastIndex);
		
		}
		
		else
		{
			System.out.println("No substring occurance found");
		}
		

	}

}
