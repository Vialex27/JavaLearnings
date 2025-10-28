package learn.com;

public class Find_SubString_in_mainString {


	public static boolean isString(String main, String sub) {

		return main.matches("(.*)" + sub + "(.*)");  //regular expression

	}
	
	
	
	public static boolean isString1(String main, String sub) {

		return main.contains(sub);
				
	}
	
	public static boolean isString2(String main, String sub) {

		return main.indexOf(sub)!=-1;
				
	}
	
	public static void main(String[] args) {

		System.out.println(isString("visva how are you", "how"));
		System.out.println(isString1("visva how are you", "are"));
		System.out.println(isString2("visva how are you", "you"));
	}

}
