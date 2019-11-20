/*This shows implmenting interface in an annonymus class*/

interface area
{
    abstract void calc(double a,double b);
}

class interface_annonymus 
{
    public static void main(String args[])
    {
        area obj=new area()
        {
            public void calc(double a,double b)
            {
                System.out.println(a*b);
            }
        };
        obj.calc(5.6,8.9);
       
    }
}