package strings;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aeiouaeiouxyz";
		
		for(int i=0;i<str.length();i++)
		{
			Boolean isAlreadySeen=false;
			
			for(int k=0;k<i;k++)
			{
				if(str.charAt(i)==str.charAt(k))
				{
					isAlreadySeen=true;
					break;
				}
			}
			if(isAlreadySeen)
			{
				continue;
			}
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					System.out.println(str.charAt(i));
					break;
				}
			}
		}
		
	}

}
