package strings;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="aeiouxyzAEIOU";
		str=str.toLowerCase();
		int vowels=0;
		int consonants=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if (ch >= 'a' && ch <= 'z')
			{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowels++;
			}
			else
			{
				consonants++;
			}
		}
		}
		System.out.println("Number of vowels present in the string are:"+vowels);
		System.out.println("Number of consonants present in the string are:"+consonants);
	}

}
