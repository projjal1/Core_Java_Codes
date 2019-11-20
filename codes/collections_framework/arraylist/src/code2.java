//Diving into methods in ArrayList
import java.util.*;

public class code2
{
    public static void main(String args[])
    {
        //ArrayList is container of objects
        ArrayList<Object> mylist=new ArrayList<>();
        //String
        mylist.add("Adding String");
        //Boolean
        mylist.add(true);
        //Integer
        mylist.add(56);

        System.out.println(mylist);

        //Now here we define the type of object we are to hold(thus,not generic in this case.)
        List<String> ls=new ArrayList<>();
        ls.add("dog");
        System.out.println(ls);
        //Changing content at index 0
        ls.add(0,"cat");
        System.out.println(ls);
        ls.add(1,"bull");
        System.out.println(ls);
        //So we see above that every thing at current pos is being moved (so we do not lose contents.)

        //Now we will remove the elements above at pos index 2
        ls.remove(2);
        System.out.println(ls);
        //Updating content at index 1
        ls.set(1,"DayDream");
        System.out.println(ls);
    }
}
