//This part of code will contain important info like marks in subjects and pt, social values.

package imp;
import java.util.*;

public class code2
{
    private int []a;  //Marks for subjects 
    private int []v;    //Marks for missc. of 3 subjects
    public code2()
    {
        a=new int[3];//Of 3 subjects
        v=new int[2];//Of pt and social values
    }
    public void setdata()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("\nEnter the marks for Science,Maths,Eng,Pt and social sc. ");
    
        //Now set for 3 subjects Science,Maths,English
        a[0]=sc.nextInt();
        a[1]=sc.nextInt();
        a[2]=sc.nextInt();
        
        //First set marks for pt and ssc
        v[0]=sc.nextInt();
        v[1]=sc.nextInt();
        
    }
    public void getdata()
    { 
        int i=0;
        for(;i<a.length;i++)
        {
            System.out.println("\nSubject "+(i+1)+ " = "+a[i]);
        }
        System.out.println("\nP.T = "+v[0]);
        System.out.println("\nSocial Sciences = "+v[1]);
    }
    public void compute()
    {
        double s1=(a[0]+a[1]+a[2])/3;
        double s2=(v[0]+v[1])/2;

        System.out.println("\nAverage marks in Science, Maths, English = "+s1);
        System.out.println("\nAverage marks in P.t and social science = "+s2);

        if(s1>40 && s2>40)
        {
            System.out.println("Result is Pass");
        }
        else 
        {
            System.out.println("Result is Fail");
        }
    }
}