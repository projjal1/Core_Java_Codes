//Introductory program for ORACLE Associate 
/**Demonstrate array list*/

import java.util.*;

public class code1
{
    public static void main(String []args)
    {
        //First syntax
        ArrayList mylist=new ArrayList();

         //Second syntax
        ArrayList<Object> mylist2=new ArrayList<Object>(); 

        //Starting from Java 5 we can write like
        ArrayList<Object> mylist3=new ArrayList<>();

        //Another way to implement is type as interface 
        List<Object> mylist4=new ArrayList<>();
        //Above we see that ArrayList implements List interface 

        //Again the below syntax does not compile 
        //ArrayList<Object> ar= new List<>();   ->:Error
        //As interface cannot be typed into variable or class (as for this instance)
    }    
}

