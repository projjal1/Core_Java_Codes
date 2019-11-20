class ChildThread extends Thread
{
    boolean st=false;
    long counter =1;
    
    ChildThread(String threadname,int prt)
    {
        super(threadname);
        this.setPriority(prt);

        System.out.println("Child Thread "+this);
        start();
    }
    public void end()
    {
        st=true;
    }
    public void run()
    {
        while(st!=true)
            counter++;
        System.out.println("Calculated value "+counter);
    }
}

class thread12
{
    public static void main(String []args)
    {
        ChildThread ob1=new ChildThread("First",Thread.NORM_PRIORITY);
        ChildThread ob2=new ChildThread("Second",Thread.MAX_PRIORITY);

        try 
        {
            Thread.sleep(1);
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread interrupted");
        }

        System.out.println("First is alive "+ob1.isAlive());
        System.out.println("Second is alive "+ob2.isAlive());
        ob1.end();
        ob2.end();

        try
        {
            ob1.join();
            ob2.join();
        }

        catch(InterruptedException e)
        {
            System.out.println("Child thread interrupted");
        }
    }
}