package Chapter_15_Command.sample01;

public class TVOpenCommand implements AbstractCommand
{
	private Television tv;
	public TVOpenCommand()
	{
		tv = new Television();
	}
	public void execute()
	{
		tv.open();
	}
}