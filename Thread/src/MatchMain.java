import java.util.*;
public class MatchMain
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		SortScore[] t=new SortScore[3];
		int a[] = new int[5];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the match ");
			String match = sc.next();
			System.out.println("Enter the scores ");
			String scores = sc.next();
			t[i]=new SortScore(match,scores);
		}
		System.out.println("ODI match sorted scores ...");
		t[0].start();
		try
		{
			System.out.println("call after the t0 start...");
			t[0].join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Test match sorted scores ...");
		t[1].start();
		try
		{
			System.out.println("call after the t1 start...");
			t[1].join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("T20 match sorted scores ...");
		t[2].start();
	}
}
		
	
		
		
		
	
