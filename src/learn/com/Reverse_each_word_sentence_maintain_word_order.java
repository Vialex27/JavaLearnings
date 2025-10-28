package learn.com;

public class Reverse_each_word_sentence_maintain_word_order {

	public static void main(String[] args) {
		
		String given ="Hi mama how are you";
	String[] tmp =	given.split(" ");
	
	String reverseSentence ="";
	
	
	for(String x : tmp)
		
	{
		String revWord ="";
		for(int i = x.length()-1;i>=0;i--)
		{
			revWord = revWord + x.charAt(i);
		}	
		reverseSentence = reverseSentence + revWord + " " ;
	}

	System.out.println("reverseSentence: " + reverseSentence);
	

	}

}
