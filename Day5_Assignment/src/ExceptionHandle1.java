import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandle1 {

	public static void main(String[] args) throws IOException {
		try {
			// Creating instance of the BufferedReader class with InputStreamReader
			BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
			int totalScore, totalOver;
			System.out.print("Enter the total runs scored :");
			totalScore = Integer.parseInt(obj.readLine());
			System.out.print("Enter the total overs faced : ");
			totalOver = Integer.parseInt(obj.readLine());
			System.out.println(totalScore / totalOver);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
