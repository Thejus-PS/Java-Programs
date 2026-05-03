package strings;

public class LongestWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hello how areeeeeeeeee you";
		String words[]=str.split(" ");
		String longest=words[0];
		
		for(int i=1;i<words.length;i++)
		{
		 if(words[i].length()>longest.length())
		 { 
			 longest=words[i]; 
		 }
		}
		System.out.println("Longest word is:"+longest);
	}
}
