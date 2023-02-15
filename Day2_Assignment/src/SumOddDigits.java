import java.util.Scanner;

public class SumOddDigits {
	public static void main(String[] args)
	{
	  Scanner scan = new Scanner(System.in);
	  int num= scan.nextInt();
	  int temp=0,oddSum=0;
	  if(num<0 || num>32767)
	  {
		  System.out.println("Invaild Input...");
	  }
	  else
	  {
		  while(num>0)
		  {
			  temp=num%10;
			  if(temp%2!=0)
			  {
				  oddSum=oddSum+temp;
			  }
			  num=num/10;
		  }
		  System.out.println(oddSum);
	  }
	}

}
