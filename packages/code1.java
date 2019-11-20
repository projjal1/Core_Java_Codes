//Program to demonstrate package usage in Java.
//This code will be a part of Student's database stores only name, roll, country

package com;
import java.util.*;

public class code1
{
    private String name,country;
    private String roll;
    public code1()
    {
        name=country=roll="";
    }
    public void setdata()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("\nEnter the name,country,roll no.");
    
        name=sc.next();
        country=sc.next();
        roll=sc.next();

    }
    public void getdata()
    {
        System.out.println("\nName : - "+name);
        System.out.println("\nCountry : - "+country);
        System.out.println("\nRoll : - "+roll);     
    }
}