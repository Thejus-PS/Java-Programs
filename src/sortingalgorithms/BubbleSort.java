package sortingalgorithms;

import java.util.Arrays;

public class BubbleSort {
	
	public static void bubbleSortAsc(int numbers[])
	{
		System.out.println("Before sorting in ascending order:"+Arrays.toString(numbers));
		int n=numbers.length;
		for(int turns=0;turns<n-1;turns++)
		{
			for(int j=0;j<n-1-turns;j++)
			{
				if(numbers[j]>numbers[j+1])
					{
						int temp=numbers[j];
						numbers[j]=numbers[j+1];
						numbers[j+1]=temp;
					}
			}
		}
		System.out.println("Arrays sorted in Ascending order"+Arrays.toString(numbers));
	}
	public static void bubbleSortDesc(int numbers[])
	{
		System.out.println("Before sorting in descending order:"+Arrays.toString(numbers));

		int n=numbers.length;
		for(int turns=0;turns<n-1;turns++)
		{
			for(int j=0;j<n-1-turns;j++)
			{
				if(numbers[j]<numbers[j+1])
					{
						int temp=numbers[j];
						numbers[j]=numbers[j+1];
						numbers[j+1]=temp;
					}
			}
		}
		System.out.println("Arrays sorted in Descending order"+Arrays.toString(numbers));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {5,4,1,3,2};
		int ascArray[]=new int[numbers.length];
		for(int i=0;i<numbers.length;i++)
		{
			ascArray[i]=numbers[i];
		}
		
		int descArray[]=new int[numbers.length];
		for(int i=0;i<numbers.length;i++)
		{
			descArray[i]=numbers[i];
		}
		bubbleSortAsc(ascArray);
		bubbleSortDesc(descArray);
	}

}
