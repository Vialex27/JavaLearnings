package learn.com;

public class Remove_all_vowels_from_string {

	public static void main(String[] args) {
		
		String str1 ="visvaram one boy ";
		
		String str = str1.toLowerCase();
		
		char[] tmp = str.toCharArray();

		String result="";
		
		for(int i =0;i<=tmp.length-1;i++)
		{
		char ch =	tmp[i];
		
		if(ch=='a' || ch=='e'|| ch=='i' || ch=='o'|| ch=='u' )
		{
			continue;
			
		}
	result = result + ch;
		
		
		}
		
		System.out.println(result);

	}

}
