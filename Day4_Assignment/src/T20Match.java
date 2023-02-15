
public class T20Match extends Match{
	float overTotal=20;
	public float calculateRunRate()
	{
		return (this.getTarget()-this.getCurrentscore())/(overTotal-this.getCurrentover());
	}

	public int calculateBalls()
	{
		float temp=overTotal-this.getCurrentover();
		return (int) (temp)*6;
	}

	public void display(double reqRunrate, int balls) 
	{
		int scoreRemain=this.getTarget()-this.getCurrentscore();
		System.out.println("Need "+ scoreRemain+" runs in "+ balls +" balls");
		System.out.println("Required Runrate: "+ reqRunrate);
	}
}
