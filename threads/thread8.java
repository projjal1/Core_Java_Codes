class thread8
{
    public static void main(String []args)
    {
        Thread t=Thread.currentThread();
        System.out.println("Current thread"+t);

        t.setName("Test Thread")    ;
        System.out.println("After changing the name "+t);

        try
        {
            for(int i=10;i>0;i--)
            {
                System.out.println("i = "+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Main Thread interrupted");
        }
    }
}