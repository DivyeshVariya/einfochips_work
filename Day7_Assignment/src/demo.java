import java.util.HashSet;
import java.util.TreeSet;

public class demo {

	public static void main(String[] args)
	{
		HashSet<Integer> hs1= new HashSet<Integer>();
		hs1.add(1);
		hs1.add(2);
		hs1.add(1);
		System.out.println(hs1);
		TreeSet<Integer> ts1= new TreeSet<Integer>();
		ts1.add(2);
		ts1.add(1);
		ts1.add(1);
		System.out.println(ts1);
	}
}
