import java.util.Scanner;
public class ShapeMain {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
	
		System.out.println("\t... Select Option ...\n"
				+ "Circle"
				+ "\r\n"
				+ "Square");
		System.out.println("Enter your choice :");
		String choice=scan.next();
		if(choice.equals("Circle"))
		{
			Circle c=new Circle();
			System.out.println("Enter radius value :");
			System.out.println("Area of circle is: "+c.calculateArea(scan.nextInt()));
		}
		else if(choice.equals("Square"))
		{
			Square s=new Square();
			System.out.println("Enter radius value :");
			System.out.println("Area of circle is: "+s.calculateArea(scan.nextInt()));
		}
		else
		{
			System.out.println("Invaild Input...");
		}
	}

}
