package strings;

import java.util.Scanner;

public class CountCharacterFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaaaaaaaaaaeeeeeeeeeiiiiiiiiii";
		System.out.println("Enter the character you want to count from the string "+str);
		Scanner sc = new Scanner(System.in);
		char ch=sc.next().charAt(0);
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
				count++;
		}
		System.out.println("The character you have entered has occured "+count+" times");
	}
}
