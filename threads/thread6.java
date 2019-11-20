import java.lang.Thread;
import java.io.*;

class thread_part1 extends Thread
{
    thread_part1()
    {
        super("Child Thread");
        System.out.println(this);
        start();
    }
    public void run()
    {
        try
        {
            System.out.println("Child");
            for(int i=5;i>0;i--)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class thread_part2 extends Thread
{
    public static void main(String []args)
    {
        new thread_part1();
        try
        {
            for(int i=5;i>0;i--)
            {
                System.out.println("Main");
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}