package java_codes_conceptual;

interface add
{
	void operate();
}

public class annonymous 
{
	public static void main(String []args)
	{
		add e=new add()
		{
			public void operate()
			{
				System.out.println("Inside annonymous class calls");
			}
		};
		e.operate();
	}
}
