import java.util.*;

class MajorityElement
{
    public static void main(String [] args)
    {
        int arr[] = {1,2};

        HashMap <Integer , Integer> map = new HashMap<>();

        for (int i : arr)
        {
            map.put(i , map.getOrDefault(i , 0) + 1 );
        }
        System.out.print("Majority Elements are : ");
        for(Map.Entry<Integer , Integer> e : map.entrySet())
        {
            if (e.getValue() > (arr.length/3))
            {
                System.out.print(e.getKey()+" ");
            }
           
        }
    }
}