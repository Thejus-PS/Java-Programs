package strings;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Thejus is qa engineer";
		
		String words[]=str.split(" ");
		String reverse="";
		
		for(int i=words.length-1;i>=0;i--)
		{
			reverse =reverse+words[i]+" ";
		}
		System.out.println(reverse);
	}
}
