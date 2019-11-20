public class var_args
{
    public static void call(int ... a)
    {
        if(a.length==0)
        {
            System.out.println("\nNothing to show");
        }
        else 
        {
            System.out.println("\n");
            for (int x:a)
            {
                System.out.print(x+" ");
            }
        }
        
    }
    public static void main(String []args)
    {
        call(4,5,7,-1);
        call();
        call(0);
    }
}