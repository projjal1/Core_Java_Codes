//Using the demonstration of synchronize element for threadsafe

import java.io.*;

class child
{
    synchronized void counter(int n)
    {
        int i=0;
        for(;i<=5;i++)
            System.out.println(n*i);
    }
}

class mainThread1   //Using annonymus class
{
    public static void main(String args[])
    {
        child obj=new child();

        System.out.println("Thread 1");
        Thread t1=new Thread()
        {
            public void run()
            {
                obj.counter(1);
            }
        };

        System.out.println("Thread 2");
        Thread t2=new Thread()
        {
            public void run()
            {
                obj.counter(2);
            }
        };

        t1.start();
        t2.start();
    }
}

//Thus we find that the execution of thread2 will continue only when thread1 has 
//done. This provides a threadsafe situation that prevents corrupted change of state 
//of object.