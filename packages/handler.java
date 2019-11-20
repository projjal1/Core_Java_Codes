//this class will handle code in com and imp package

package adapter;
import java.util.*;
import com.code1;
import imp.code2;

class code3
{
    public void input(code1 ob1,code2 ob2)
    {
        ob1.setdata(); 
        ob2.setdata();       
    }
    public void display(code1 a,code2 b)
    {
        a.getdata();
        b.getdata();
        b.compute();
    }
}
public class handler
{
    public static void main(String []args)
    {
       
        int n;
        System.out.println("Enter the no. of students");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        
        code3 ob[]=new code3[n];  //Array of class
        code1 obj1[]=new code1[n];
        code2 obj2[]=new code2[n];
        
        //Now allocation heap to each array member
        for(int i=0;i<n;i++)
        {
            ob[i]=new code3();
            obj1[i]=new code1();
            obj2[i]=new code2();
        }
            

        for (int i=0;i<n;i++)
        {
            System.out.println("\nEnter the details for user "+(i+1));
            ob[i].input(obj1[i], obj2[i]);
        }
        
        for (int i=0;i<n;i++)
        {
            System.out.println("\nDisplaying details for user "+(i+1));
            ob[i].display(obj1[i], obj2[i]);
        }
    }
}
