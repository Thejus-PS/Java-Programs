package strings;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="mypencil";
		String str2="encilmyp";
		
		if(str1.length()==str2.length())
		{
			str1=str1+str1;
			if(str1.contains(str2))
			{
				System.out.println("String is a rotation of another string");
			}
			else
			{
				System.out.println("String is not rotation of another string");
			}
		}
		else
		{
		 System.out.println("String is not rotation of another string");
		}
	}
}
