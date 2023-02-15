/*
2. Find the CricketerId who has score more than given number

Read the question carefully and follow the input and output format. 
Given an input array first Index indicates the cricketer’s id and second index indicates the score and so on……
Find out the cricketer's id who scored more than given score 

Input and Output Format : First line of input consists of n, the number of elements. 
Next n lines correspond to the array elements.
The next line of the input consists of an integer that corresponds to the given score. 
Output consist of an integer array, which contains cricketer's id who have scored more than the given score.

1) Print "Invalid array size" when size of the array is negative and terminate the program . 
2) Print "Invalid input" when there is any negative numbers available in the input array and terminate the program. 
3) Print "Invalid score" when the score is negative.
*/

import java.util.Scanner;

public class Program2 {
	
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Array size :");
		int sizeArr=scan.nextInt(),i=0;
		if(sizeArr<=0 || sizeArr%2!=0)
		{
			System.out.println("Invalid array size");
			System.exit(0);
		}
		int criketerArr[]=new int[sizeArr],checkScore=0;
		System.out.println("Enter the id and score of each Criketer :");
		for(i=0;i<(sizeArr/2);i++)
		{
			criketerArr[i*2]=scan.nextInt();
			criketerArr[(i*2)+1]=scan.nextInt();
			if(criketerArr[i]<0 || criketerArr[i+1]<0)
			{
				System.out.println("Invalid Input");
				System.exit(0);
			}
		}
		System.out.println("Enter the minimum score for check:");
		checkScore=scan.nextInt();
		System.out.println("Max Scored Criketer's id :");
		for(i=1;i<sizeArr;i=i+2)
		{
			if(criketerArr[i]>checkScore)
			{
				System.out.println(criketerArr[i-1]);
			}
			else if(criketerArr[i]<=checkScore && i==sizeArr-1)
			{
				System.out.println("No have any criketer...");
			}
		}
	}
}
