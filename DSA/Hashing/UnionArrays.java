import java.util.*;
class UnionArrays
{
    public static void main(String [] args)
    {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        Set <Integer> set = new TreeSet<>();
        for (int i : arr1)
        {
            set.add(i);
        }
        for(int i : arr2)
        {
            set.add(i);
        }

        Iterator it = set.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println("Size of Union is : "+set.size());
    }
}