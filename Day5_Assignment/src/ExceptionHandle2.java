import java.util.Scanner;

public class ExceptionHandle2 {

	public static void main(String[] args)
	{
		try
		{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of overs :");
		int numOver=scan.nextInt(),search;
		if(numOver<0)
		{
			throw new NegativeArraySizeException("error");
		}
		int arrRun[]=new int[numOver];
		System.out.println("Enter the number of runs for each over :");
		for(int i=0;i<numOver;i++)
		{
			arrRun[i]=scan.nextInt();
		}
		System.out.println("Enter the over number :");
		search=scan.nextInt();
		System.out.println("Runs scored in this over : " + arrRun[search-1] );
		
		}
		catch(NegativeArraySizeException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
}
