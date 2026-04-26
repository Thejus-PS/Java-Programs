package strings;

import java.util.Arrays;

public class Anagrams {
	
	public static void main(String[] args)
	{
		String str1 = "Listen";
		String str2 = "Silent";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if (str1.length() == str2.length()) {
			
			char str1CharArray[] = str1.toCharArray();
			char str2CharArray[] = str2.toCharArray();
			
			Arrays.sort(str1CharArray);
			Arrays.sort(str2CharArray);
			
			boolean res = Arrays.equals(str1CharArray, str2CharArray);
			
			if (res)
				System.out.println("Strings are Anagrams");
			else
				System.out.println("Strings are not Anagrams");
			
		} else {
			System.out.println("Strings are not anagrams");
		}
	}

}
