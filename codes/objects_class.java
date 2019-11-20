package java_codes_conceptual;

//Implement cloneable for extending cloning ability
class Red implements Cloneable
{
	int a;
	int x;
	public Red(int z)
	{
		a=0;
		x=0;
		a+=z;
		x+=z;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

class White
{
	int a;
	String x;
	public White(int z)
	{
		a=0;
		x="";
		a+=z;
		x+=Integer.toString(z);
	}
}

public class objects_class 
{
	public static void main(String args[]) throws CloneNotSupportedException
	{
		//Now let's create objects of two classes
		Red o1=new Red(8);
		White o2=new White(1);
	
		//Let's compare the two objects
		boolean comp;
		comp=o1.equals(o2);
		System.out.println(comp);  //False
		
		//Get class of objects and their hashcodes
		System.out.println("Hashcode of Red object "+o1.hashCode());
		System.out.println("Hashcode of White object "+o2.hashCode());
		
		System.out.println("Getclass of Red object "+o1.getClass());
		System.out.println("Getclass of White object "+o2.getClass());
	
		//Create clone of o1
		Red o3=(Red)o1.clone();
		System.out.println(o3.a+" "+o3.x);
		System.out.println(o3.toString());
	}
}
