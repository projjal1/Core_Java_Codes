//Demonstrate threadpool using executor framework

import java.io.*;
import java.util.concurrent.*;

class Task implements Runnable
{
    public void run()
    {
        System.out.println("Hello");
    }
}

public class ThreadPool 
{ 
    public static void main(String []args)
    {
        int numtasks=10;
        ExecutorService pool=Executors.newCachedThreadPool();

        for(int i=0;i<numtasks;i++)
        {
            pool.execute(new Task());
        }
        pool.shutdown();
    }
}