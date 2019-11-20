import java.lang.Thread;

class A extends Thread
{
    public void run()
    {
        for (int i=0;i<5;i++)
        {
            if(i==0)
                yield();
            System.out.println("From thread A " +(i+1));
        }
        System.out.println("Exit from thread A");
    }
}

class B extends Thread
{
    public void run()
    {
        for (int j=0;j<5;j++)
        {
            System.out.println("From thread B "+(j+1));
            if(j==3)
                this.stop();
        }
        System.out.println("Exit from thread B");
    }
}

class C extends Thread
{
    public void run()
    {
        for (int k=0;k<5;k++)
        {
            System.out.println("From thread C "+(k+1));
            if(k==1)
            {
                try
                {
                    this.sleep(1000);
                }
                catch(InterruptedException e)
                {
                    System.out.println("Thread C interrupted");
                }
            }
        }
        System.out.println("Exit from Thread C");
    }
}

class thread13
{
    public static void main(String args[])
    {
        A a= new A();
        B b= new B();
        C c= new C();
        
        System.out.println("Start from thread A");
        a.start();
        System.out.println("Start from thread B");
        b.start();        
        System.out.println("Start from thread C");
        c.start();
       
    
        System.out.println("Exit from main thread ");
    }
}