import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args)
	{
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		/// return only even number 
		List<Integer> l4=al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l4);
		List<Integer> l5=al.stream().map(i->i*10).collect(Collectors.toList());
		System.out.println(l5);
		long c= al.stream().filter(i->i%2==0).count();
		System.out.println(c);
		List<Demo1> ld= new ArrayList<Demo1>();
		ld.add(new Demo1("kohli",1));
		ld.add(new Demo1("kohli1",2));
		ld.add(new Demo1("kohli2",3));
		ld.add(new Demo1("kohli3",4));
		ld.add(new Demo1("kohli4",5));
		List<Demo1> cnt=ld.stream().filter(i->i.getRuns()<4).collect(Collectors.toList());
		for(Demo1 d : cnt)
		{
		System.out.println(d.getName());
		}
		long pl=ld.stream().filter(i->i.getRuns()>4).count();
		System.out.println(pl);
		List<Integer> lm=ld.stream().map(i->i.getRuns()+10).collect(Collectors.toList());
		System.out.println(lm);
	}

}
