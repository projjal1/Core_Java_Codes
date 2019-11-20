import java.io.*;
import java.lang.Thread;

//Simple program to demonstrate the use of thread in java


public class thread5 extends Thread
{
    public thread5()
    {
        super("Child thread");
        System.out.println(this);
    }

    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
        }
    }

    public static void main (String []args)
    {
        thread5 t=new thread5();
        t.start();
    }
}