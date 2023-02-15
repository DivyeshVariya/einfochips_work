import java.util.Scanner;
public class MatchMain {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.println("\t ... Type of Match ...\n"
					+ "1. ODI"
					+ "\r\n"
					+ "2. T20"
					+ "\r\n"
					+ "3. Test");
			System.out.println("Enter your choice :");
			int choice=scan.nextInt(),tempo;
			float temp;
			switch(choice)
			{
			case 1:
				ODIMatch odi=new ODIMatch();
				System.out.println("Enter the Current score :");
				odi.setCurrentscore(scan.nextInt());
				System.out.println("Enter the Current Over :");
				temp=scan.nextFloat();
				if(temp<=50.0)
				{
				odi.setCurrentover(temp);
				}
				else
				{
					System.out.println("Invaild Input....");
					System.exit(0);
				}
				System.out.println("Enter the Target Score :");
				tempo=scan.nextInt();
				if(tempo>odi.getCurrentscore())
				{
					odi.setTarget(tempo);
				}
				else
				{
					System.out.println("Invaild Input....");
					System.exit(0);
				}
				odi.display(odi.calculateRunRate(), odi.calculateBalls());
				System.exit(0);
				break;
			case 2:
				T20Match t20=new T20Match();
				System.out.println("Enter the Current score :");
				t20.setCurrentscore(scan.nextInt());
				System.out.println("Enter the Current Over :");
				temp=scan.nextFloat();
				if(temp<=20.0)
				{
				t20.setCurrentover(temp);
				}
				else
				{
					System.out.println("Invaild Input....");
					System.exit(0);
				}
				System.out.println("Enter the Target Score :");
				tempo=scan.nextInt();
				if(tempo>t20.getCurrentscore())
				{
					t20.setTarget(tempo);
				}
				else
				{
					System.out.println("Invaild Input....");
					System.exit(0);
				}
				t20.display(t20.calculateRunRate(), t20.calculateBalls());
				System.exit(0);
				break;
			case 3:
				TestMatch test=new TestMatch();
				System.out.println("Enter the Current score :");
				test.setCurrentscore(scan.nextInt());
				System.out.println("Enter the Current Over :");
				temp=scan.nextFloat();
				if(temp<=90.0)
				{
				test.setCurrentover(temp);
				}
				else
				{
					System.out.println("Invaild Input....");
					System.exit(0);
				}
				System.out.println("Enter the Target Score :");
				tempo=scan.nextInt();
				if(tempo>test.getCurrentscore())
				{
					test.setTarget(tempo);
				}
				else
				{
					System.out.println("Invaild Input....");
					System.exit(0);
				}
				test.display(test.calculateRunRate(), test.calculateBalls());
				System.exit(0);
				break;
			default:
				System.out.println("Invaild Input....");
				System.exit(0);
				break;
			}
		}
	}

}
