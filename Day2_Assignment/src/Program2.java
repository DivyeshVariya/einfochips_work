import java.util.Scanner;
public class Program2 {
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		int num=scan.nextInt();
		int i=0;
		int[] pow2List= {1,2,4,8,16,32,64,128,256,512,1024,2048,4096,8192,16384,32768};
		if(num<=0)
		{
			System.out.println("Number too small...");
		}
		else if(num>32767)
		{
			System.out.println("Number too large...");
		}
		else
		{
			for(i=0;i<pow2List.length;i++)
			{
			if(pow2List[i]==num)
			{
				System.out.println("YES");
				break;
			}
			}
			if(i>=16)
			{
				System.out.println("NO");	
			}
		}
	}
}
