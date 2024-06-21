import java.util.*;

class IntersectionArrays
{
    public static void main(String [] args)
    {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        ArrayList <Integer> list = new ArrayList<>();
        Set <Integer> set = new TreeSet<>();
        for (int i : arr1)
        {
            set.add(i);
        }
        for (int i : arr2)
        {
            if (set.contains(i))
            {
                list.add(i);
                set.remove(i);
            }
        }       
        System.out.println(list);
        System.out.println("The Size fo intersection : "+list.size());
        
        

    }
}