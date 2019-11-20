public class command_line_args
{
    public static void main(String args[])
    {
        if(args.length==0)
        {
            System.out.println("No command line argument entered");
        }
        else 
        {
            for (int i=0;i<args.length;i++)
            {
                System.out.println(args[i]);
            }
        }
    }
}