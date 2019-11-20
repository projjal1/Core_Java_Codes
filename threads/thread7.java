import java.lang.Thread;
import java.io.*;

//Program to implement thread using runnable structure

class thread7_part1 extends Thread
{
    String m;
    public thread7_part1(String nm)
    {
        this.setName(nm);
        m=nm;
        this.start();
    }   
    public void run()
    {
        try 
        {
            for(int i=0;i<5;i++)
            {
                System.out.println(m);
                System.out.println(i);
                this.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

public class thread7
{
    public static void main(String []args)
    {
        thread7_part1 o1,o2,o3;
        o1=new thread7_part1("Child1");
        o2=new thread7_part1("Child2");
        o3=new thread7_part1("Child3");

        try
        {
            o1.join();
            o2.join();
            o3.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println(o1.isAlive());
        System.out.println(o2.isAlive());
        System.out.println(o3.isAlive());
    }
}