import java.util.*;

class Itinerary
{
    public static void main(String [] args)
    {
        HashMap<String , String > map = new HashMap<>();

        map.put("Mumbai" , "Delhi"); 
        map.put("Goa" , "Chennai"); 
        map.put("Delhi" , "Goa"); 
        map.put("Chennai" , "Bengaluru"); 

        HashMap<String , String > Rmap = new HashMap<>();

        for (String i : map.keySet())
        {
            Rmap.put(map.get(i) , i);
        }
        String start = "";
        
        for (String key : map.keySet())
        {

            if (!Rmap.containsKey(key))
            {
                start = key;
            }
        }
        while(map.containsKey(start))
        {
            System.out.print(start+" -> ");
            start = map.get(start);
        }
        System.out.print(start);
    }
}