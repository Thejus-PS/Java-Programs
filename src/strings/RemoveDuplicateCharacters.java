package strings;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aeiouaeiou";
		String result="";
		
		for(int i=0;i<str.length();i++)
		{	
			char ch=str.charAt(i); 
			if(result.indexOf(ch)==-1)
			{
				result=result+ch;
			}
		}
		System.out.println("String without duplicate characters:"+result);
	}

}
