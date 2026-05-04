package sortingalgorithms;

import java.util.Arrays;

public class SelectionSort {
	
	public static void sortAsc(int numbers[])
	{
		for(int i=0;i<numbers.length-1;i++)
		{
			int smallest=i;
			for(int j=i+1;j<numbers.length;j++)
			{
				if(numbers[j]<numbers[smallest])
				{
					smallest=j;
				}
			}
			int temp=numbers[i];
			numbers[i]=numbers[smallest];
			numbers[smallest]=temp;	
		}
		System.out.println("After sorting in ascending order:"+Arrays.toString(numbers));
	}
	
	public static void sortDesc(int numbers[])
	{
		for(int i=0;i<numbers.length-1;i++)
		{
			int smallest=i;
			for(int j=i+1;j<numbers.length;j++)
			{
				if(numbers[j]>numbers[smallest])
				{
					smallest=j;
				}
			}
			int temp=numbers[i];
			numbers[i]=numbers[smallest];
			numbers[smallest]=temp;	
		}
		System.out.println("After sorting in descending order:"+Arrays.toString(numbers));
	}
	public static void main(String[] args) {
		
		int numbers[]= {5,3,4,1,2};
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
		
		sortAsc(ascArray);
		sortDesc(descArray);
	}
}
