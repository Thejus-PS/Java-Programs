package strings;

public class ReplaceVowelsWithAsterisk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="aeiouxyzaeiou";
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				sb.append('*');
			}
			else
			{
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}
}
