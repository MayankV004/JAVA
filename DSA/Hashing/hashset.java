import java.util.HashSet;
import java.util.Iterator;

class hashset
{
    public static void main(String [] args)
    {
        HashSet <Integer> set = new HashSet<>();

        // Add
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(65);
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
        //Iterator - HashSet doesNot have a order
        
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
            System.out.println("Set is not Empty");
        }
    }
}