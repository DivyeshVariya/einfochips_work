import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int n=scan.nextInt();
	scan.nextLine();
	String[] strlist= new String[n];
	for(int i=0;i<n;i++)
	{
		strlist[i]=scan.nextLine();
	}
	strlist=convert(strlist);
	for(String s: strlist)
	{
	System.out.println(s);
	}
}
static String[] convert(String[] strlist)
{
	for(int i=0;i<strlist.length;i++)
	{
		String tempory="";
		char[] temp=strlist[i].toCharArray();
		for(char ch :temp)
		{
			ch=mapping(ch);
			tempory+=ch;
		}
		strlist[i]=tempory;
	}
	return strlist;
}
static char mapping(char ch)
{
	switch(ch)
	{
	case 'a':
		return 'z';
	case 'b':
		return 'y';
	case 'c':
		return 'x';
	case 'd':
		return 'w';
	case 'e':
		return 'v';
	case 'f':
		return 'u';
	case 'g':
		return 't';
	case 'h':
		return 's';
	case 'i':
		return 'r';
	case 'j':
		return 'q';
	case 'k':
		return 'p';
	case 'l':
		return 'o';
	case 'm':
		return 'n';
	case 'n':
		return 'm';
	case 'o':
		return 'l';
	case 'p':
		return 'k';
	case 'q':
		return 'j';
	case 'r':
		return 'i';
	case 's':
		return 'h';
	case 't':
		return 'g';
	case 'u':
		return 'f';
	case 'v':
		return 'e';
	case 'w':
		return 'd';
	case 'x':
		return 'c';
	case 'y':
		return 'b';
	case 'z':
		return 'a';
	}
	return 'A';
}
}
