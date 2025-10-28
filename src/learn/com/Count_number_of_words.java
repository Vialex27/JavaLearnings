package learn.com;

public class Count_number_of_words {

	public static void main(String[] args) {
		
		String str="Hi ram how are you";
		int count=0;
		
		String[] tmp =str.split(" ");

		for(String x: tmp) {
			count+=1;
			
		}
		
		System.out.println(count);
	}

}
