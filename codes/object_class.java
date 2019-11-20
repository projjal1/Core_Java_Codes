class object_action extends Object
{
    public void sum(int x,int y)
    {
        int c=x+y;
        System.out.println(c);
    }
}

public class object_class
{
    public static void main(String args[]) throws CloneNotSupportedException
    {
        object_action e=new object_action();
        object_action f;
        f=(object_action)(e.clone());
        System.out.println(e.toString());
    }
} 