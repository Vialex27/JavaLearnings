package learn.com;

public class Capitalize_each_word_first_letter {


	public static void main(String[] args) {

//
//		String input ="how are you visva ";
//
//		String result="";
//
//		boolean makeUpper = true;
//
//		for(int i =0;i<=input.length()-1;i++) {
//
//			char ch =input.charAt(i);
//
//			if(ch ==' ')
//			{
//				result =result + ch;
//				makeUpper = true;
//			}
//
//			else
//			{
//				if(makeUpper == true) {
//
//					result = result +	Character.toUpperCase(ch);
//					makeUpper = false;
//				}
//
//				else
//				{
//					result = result + ch;
//				}
//			}
//
//		}
//
//		System.out.println(result);


		 String str ="how are you visva ";
   String[] input= str.split(" ");
   String result ="";

   for(String x: input)
   {
	   result  =  result+ x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() +" ";

}

System.out.print(result);

		 


	}
}







