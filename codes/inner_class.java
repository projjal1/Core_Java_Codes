package java_codes_conceptual;

class outer
{
	int x;
	public outer()
	{
		x=21;
	}
	public void show() {
		System.out.println("From outer "+x);
	}
	public void call()
	{
		inner obj=new inner();
		obj.show();
	}
	class inner
	{
		public void show()
		{
			x+=1;
			System.out.println("From inner "+x);
		}
	}
}
public class inner_class 
{
	public static void main(String args[])
	{
		outer o=new outer();
		o.show();
		o.call();
		o.show();
		
	}
}
