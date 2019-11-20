class MainThread
{
    public static void main(String args[])
    {
        Thread t=Thread.currentThread();
        System.out.println("Current thread "+ t);

        t.setName("Test Thread");
        System.out.println("Name changed to "+t);

        try 
        {
            for(int i=10;i>0;i--)
            {
                System.out.println("i= "+i);
                Thread.sleep(1000);
            }    
        } catch (Exception e) 
        {
            System.out.println("Main thread interrupted");
        }
    }
}