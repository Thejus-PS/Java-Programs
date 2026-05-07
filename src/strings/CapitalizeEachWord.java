package strings;

public class CapitalizeEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="hello how are you";
		
		if (str == null || str.isEmpty()) {
			System.out.println("String is empty");
			return;
		}
			
		StringBuilder sb = new StringBuilder();
		sb.append(Character.toUpperCase(str.charAt(0)));
		
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i-1)==' ')
			{
				sb.append(Character.toUpperCase(str.charAt(i)));
			}
			else
			{
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}
}
