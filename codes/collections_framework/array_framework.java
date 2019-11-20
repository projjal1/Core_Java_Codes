import java.util.*;

class array_framework
{
    public static void main(String []args)
    {
        ArrayList <String> ar=new  ArrayList<String> ();
        ar.add("Projjal");
        ar.add("Vivek");
        ar.add("Amardeep");
        ar.add("Abhishek");

        Iterator iter=ar.iterator();

        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }
}