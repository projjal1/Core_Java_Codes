//Code to demonstrate throwing rethrowing in Java

import java.io.*;
import java.lang.NumberFormatException;

class Child
{
    public static void main(String args[])
    {
        try 
        {
            call();       
        }
        catch (Exception e) 
        {
            System.out.println("Return from call");
        }
    }
    public static void call()
    {
        try
        { 
            String st="er1";
            int a=Integer.parseInt(st);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Exception caught");
            throw e;  //Rethrows the exception back to be handled in Child catch
        }
    }
}