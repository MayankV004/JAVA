import java.util.*;

class hashmap
{
    // Internally HashMap is Implemented as Array Of Linked list

    // Hashing means data ki form change karna
    // Eg. "abc" -> 3256
    public static void main(String [] args)
    {
        Map <Character , Integer> map = new HashMap<>();

        /* Insertion - map.put(key,value)
         or when finding frequency use 
         map.put(key , map.getOrDefault(Key , default Value) + 1)
        */
        map.put('A', 2);
        map.put('B', 3);
        map.put('C', 5);
        map.put('D', 7);
        map.put('E', 9);

        //Print all
        System.out.println(map);
        System.out.println("-------------------------------------------");
        //updating - just put the updated value for the pair
        map.put('C',1);
        System.out.println(map);
        System.out.println("-------------------------------------------");
        // searching Or Is present in the map or not
        // using map.containsKey(key)
        if (map.containsKey('A'))
        {
            System.out.println("Key is present");
        }
        else
        {
            System.out.println("Key is Absent");
        }
        System.out.println("-------------------------------------------");

        // To Exteract value at key -> map.get(key); 
        System.out.println(map.get('D')); // Key Exists -> prints value
        System.out.println(map.get('F')); // Key Doesnot Exists -> prints null
        System.out.println("-------------------------------------------");
        // Iteration 

        //Method 1 -> usint map.entrySet()

        for (Map.Entry<Character , Integer> e : map.entrySet())
        {
            System.out.println(e.getKey() + " -> "+e.getValue());
        }
        System.out.println("-------------------------------------------");        
        //Method 2 -> using map.keySet();

        Set<Character> keys = map.keySet();
        
        for (char key : keys)
        {
            System.out.println(key + " -> " + map.get(key));
        }
        System.out.println("-------------------------------------------");
        //Removing key value pair -> map.remove(key);

        map.remove('A');
        System.out.println(map);
        System.out.println("----------------------X--------------------");
    }
}