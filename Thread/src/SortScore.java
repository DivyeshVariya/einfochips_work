
import java.util.Arrays;
import java.util.stream.Collectors;
public class SortScore extends Thread
{
	private String matchType,scoreString;
	String[] temp = {};
	private Integer[] scores = new Integer[5];
	public SortScore(String matchType,String scoreString)
	{
		this.matchType = matchType;
		this.scoreString = scoreString;
	}
	@Override
	public void run()
	{
		try
		{
			temp = this.scoreString.split(",");
			for(int i=0;i<5;i++)
			{
				scores[i] = Integer.parseInt(temp[i]);
				//System.out.println(scores[i]);
			}
			Arrays.sort(scores);
			for(int i=0;i<5;i++)
			 {
			 System.out.println(scores[i]);
			 }			 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public Integer[] getScore()
	{
		return this.scores;
	}
	public void setScore(Integer s[])
	{
		s=this.scores;
	}
}
			

