import java.io.*;

interface act
{
    void age();
}

public class prog1
{
    public static void main(String []args)
    {
        int a=90;
        System.out.println("Starting anonymous class");
        act ob=new act()
        {
            public void age()
            {
                int a=90;   //value of variable overriden
                System.out.println("a new value ="+a);
            }            
        };
        ob.age();
    }
}