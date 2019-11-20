class NewThread implements Runnable
{
	int fact=1,i=0;
	Thread t;
	NewThread()
	{
		t= new Thread(this, "Demo Thread");
		t.start();
	}
	public void run()
	{
		try
		{
			for(i=1;i<=5;i++)
			{
				fact=i*fact;
				System.out.println("child factorial value:"+fact);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("child interrupted");
		}
		System.out.println("existing child interrupted");
	}
}

class fact
{
	public static void main(String args[])
	{
		int fact=1, i=0;
		new NewThread();
		try
		{
			for(i=1; i<5; i++)
			{
				fact=i*fact;
				System.out.println("main factorial value:"+fact);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("main interrupted");
		}
		System.out.println("existing main interrupted");
	}
}