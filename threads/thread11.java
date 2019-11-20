class childthread implements Runnable 
{
    Thread t;

    childthread()
    {
        System.out.println("Child thread before allocation " +t);
        t=new Thread(this,"Child");
        System.out.println("Child thread after allocation " +t);
        t.start();
    }
    public void run()
    {
        try 
        {
            for(int i=0;i<6;i++)
            {
                System.out.println("Child thread "+i);
                t.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Child thread interrupted");
        }
        System.out.println("Child thread exiting");
    }
}

class thread11
{
    public static void main(String []args)
    {
        new childthread();
        try 
        {
            for(int i=0;i<6;i++)
            {
                System.out.println("Main thread "+i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");
    }
}