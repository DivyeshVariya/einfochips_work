import java.util.Scanner;

class Assign1Program1{
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		int salary=scan.nextInt();
		if(salary>8000)
		{
		System.out.println("Salary too large...");
		}
		else
		{
		int shifts=scan.nextInt();
		if(shifts<=0)
		{
		System.out.println("Shifts too small...");
		}
		else if(salary<=0)
		{
		System.out.println("Salary too small...");
		}
		else
		{
		float shiftSalary= (salary*2)/100;
		float totalSalary= salary + shiftSalary*shifts;
		float foodCost = (salary*20)/100;
		float travelCost = (salary*30)/100;
		System.out.println(totalSalary-foodCost-travelCost);
		}
	}
}
}