import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class randomNumberGenerate {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements :");
		int numberOfInput = scan.nextInt();
		if (numberOfInput < 3) {
			System.out.println("Invalid Input...");
			System.exit(0);
		} else {
//--------------- method 1 using user input--------------------------
			System.out.println("Enter elements :");
			Integer numberList[] = new Integer[numberOfInput];
			for (int i = 0; i < numberOfInput; i++) {
				numberList[i] = scan.nextInt();
				if (numberList[i] < 0) {
					System.out.println("Invalid Input...");
					System.exit(0);
				}
			}
			Arrays.sort(numberList, Collections.reverseOrder());
			System.out.println("product of First and third highest element :" + (numberList[0] * numberList[2]));

//----------------------method 2 using random function --------------------		
//		System.out.println("Enter elements :");
//		Integer numberList[]=new Integer[numberOfInput];
//		for(int i=0;i<numberOfInput;i++)
//		{
//		numberList[i]=(int) ((Math.random()*100)+1);
//			if(numberList[i]<0)
//			{
//				System.out.println("Invalid Input...");
//				System.exit(0);
//			}
//		}
//		for(int i=0;i<numberOfInput;i++)
//		{
//			System.out.println(numberList[i]);
//		}
//		Arrays.sort(numberList,Collections.reverseOrder());
//		System.out.println("product of First and third highest element :"+ (numberList[0]*numberList[2]));

		}
	}
}
