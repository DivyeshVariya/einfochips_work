import java.util.HashMap;
import java.util.TreeMap;

public class Demo {
	public static void main(String[] args)
	{
		HashMap<String,Integer> hm= new HashMap<String,Integer>();
		System.out.println(hm.put("koihli",234));
		System.out.println(hm.put("koihli",23));
		System.out.println(hm.put("koihli",2));
		System.out.println(hm);
		System.out.println(hm.keySet());
		TreeMap<String,Integer> tm= new TreeMap<String,Integer>();
		System.out.println(tm.put(null,234));
		System.out.println(tm.put(null,23));
		
	}

}
