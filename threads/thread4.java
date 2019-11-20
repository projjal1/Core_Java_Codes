class NewThread extends Thread
{
	String name;
	NewThread(String threadname)
	{
		name = threadname;
		System.out.println("child thread"+this);
		start();
	}
	public void run()
	{
		try
		{
			for(int i= 5; i>0; i--)
			{
				System.out.println("child thread"+i);
				Thread.sleep(500);
				System.out.println("is run method is alive"+Thread.currentThread().isAlive());
			}
		}
		catch (InterruptedException e) 
			{
			System.out.println("Child interrupted.");
			}
		System.out.println("Exiting child thread.");
	}
}

class DemoJoin
{
	public static void main(String args[])
	{
		NewThread obj1= new NewThread("one");
		NewThread obj2= new NewThread("two");
		NewThread obj3= new NewThread("three");
		try
		{
			System.out.println("Waiting for threads to exit");
			obj1.join();
			obj2.join();
			obj3.join();
		}
		catch (InterruptedException e) 
		{
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Main thread exiting.");
	}
}