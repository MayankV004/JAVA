import java.util.*;

class treeset
{
    public static void main(String [] args)
    {
        Set <Integer> set = new TreeSet<>();

        // Add
        set.add(1);
        set.add(2);
        set.add(65);
        set.add(2);
        set.add(3);
        System.out.println(set);
        //Size
        System.out.println(set.size());

        //Search
        if (set.contains(65))
        {
            System.out.println("Found the element");
        }

        if (!set.contains(4))
        {
            System.out.println("absent");
        }
        //Remove

        set.remove(3);
        if (!set.contains(3))
        {
            System.out.println("absent");
        }

        //Print all Elements
        System.out.println(set);
        set.add(0);
        //Iterator - TreeSet is sorted set
        
        Iterator it = set.iterator();
        // hasNext() - return true or false
        // next - returns the next element

        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println();

        //Empty
        if (!set.isEmpty())
        {
            System.out.println("TreeSet is not Empty");
        }
    }
}