class ChildThread extends Thread
{
    ChildThread()
    {
        super("Thread");  //Has same effect of this.setName()
        System.out.println(this.getName());
        start();
    }

    public void run()
    {
        try
        {
            for (int i=5;i>0;i--)
            {
                System.out.println("Child thread " + i);
                Thread.sleep(1000);  //Has same effect of this.sleep()    
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Child thread Interrupted");
        }
        System.out.println("Child thread exiting");
    }
}

class thread10
{
    public static void main(String []args)
    {
        new ChildThread();

        try
        {
            for (int i=5;i>0;i--)
            {
                System.out.println("Main thread " + i);
                Thread.sleep(2000);  //Has same effect of this.sleep()    
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting");
    }
}