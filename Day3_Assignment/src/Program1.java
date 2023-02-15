/*
 Program 01: Maximum sum of Odd or Even Number

Given an Integer array, find out sum of Even and odd Numbers individually and find the maximum. 
Input and Output Format : 
First line of input consists of n, the number of elements. 
Next n lines correspond to the array elements. 
Output consist of maximum of odd and even sum. 
1) Print "Invalid array size" when size of the array is a negative number and terminate the program. 
2) Print "Invalid input" when there is any negative numbers available in the input array and terminate the program.
 */

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Array size :");
		int sizeArr = scan.nextInt();
		if(sizeArr<=0)
		{
			System.out.println("Invalid array size");
			System.exit(0);
		}
		int numArr[]=new int[sizeArr],oddSum=0,evenSum=0;
		System.out.println("Enter the Array elements :");
		for(int i=0;i<sizeArr;i++)
		{
			numArr[i]=scan.nextInt();
			if(numArr[i]<0)
			{
				System.out.println("Invalid Input");
				System.exit(0);
			}
			else
			{
				if(numArr[i]%2==0)
				{
					evenSum=evenSum+numArr[i];
				}
				else
				{
					oddSum=oddSum+numArr[i];
				}
			}
		}
		if(oddSum>evenSum)
		{
			System.out.println(oddSum);
		}
		else
		{
			System.out.println(evenSum);
		}
	}
}
