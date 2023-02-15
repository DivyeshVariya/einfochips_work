import java.util.ArrayList;
import java.util.Scanner;

public class Program1 {
	
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		ArrayList al= new ArrayList();
		System.out.println("\t--- Input the player details ----");
		System.out.println("Enter player name :");
		al.add(scan.next());
		System.out.println("Enter player age :");
		al.add(scan.nextInt());
		System.out.println("Enter player Country :");
		al.add(scan.next());
		System.out.println("\n\t--- Player Details ---");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("Enter player Skill :");
		String skill=scan.next();
		System.out.println("Enter the position to add the skill :");
		al.set(scan.nextInt(),skill);
		System.out.println("\n\t--- Player Details ---");
		System.out.println(al.get(0) +"\n"+ al.get(1)+"\n"+al.get(2));
		System.out.println("Enter the position of the detail to be removed :");
		al.remove(scan.nextInt());
		System.out.println("\n\t--- Player Details ---");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	}

}
