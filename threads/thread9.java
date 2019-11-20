class newThread extends Thread
{
    newThread()
    {
        System.out.println("Child thread");
        System.out.println(this);
    }
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("From thread" + this.getName() + " i = "+i);
            System.out.println("Exiting from thread " + this.getName());
        }
    }
}

class thread9
{
    public static void main(String args[])
    {
        newThread c=new newThread();
        c.start();
    }
}