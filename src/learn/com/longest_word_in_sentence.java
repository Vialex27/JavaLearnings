package learn.com;

public class longest_word_in_sentence {

	public static void main(String[] args) {

		String str="hi ram whaat are you doing";
		String[] tmp = str.split(" ");

		int count = 0;

		for(String x: tmp) {
			if( x.length()>count)
			{
				count = x.length();
			}	

		}

		System.out.println(count);

		for(int i =0;i<=tmp.length-1;i++) {

			if(count == tmp[i].length())
			{
				System.out.println("largest word: " + tmp[i]);

			}
		}

	}

}
