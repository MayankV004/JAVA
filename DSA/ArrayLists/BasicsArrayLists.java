import java.util.ArrayList;
import java.util.Collections;
class BasicsArrayLists
{
    public static void main(String [] args)
    {
        ArrayList<String> l1 = new ArrayList<>();


        //Adding Elements  Eg . L1.add(Element)
        l1.add("A"); 
        l1.add("B"); 
        l1.add("C"); 
        l1.add("D");
        System.out.println(l1); 

        // getting element Eg . L1.get(Index)

        String s1 = l1.get(1);
        System.out.println(s1);

        //set/update element  Eg. L1.set(Index , element)
        l1.set(1, "M");
        System.out.println(l1);


        // adding in between Eg . l1.add(Index , element)
        l1.add(2 , "Z");
        System.out.println(l1);

        // Deleting Element Eg. L1.remove(Index)
        l1.remove(1);
        System.out.println(l1);

        //Size of ArrayList  Eg. L1.size()
        int Size = l1.size();
        System.out.println(Size);


        //Loops
        for (int i = 0 ; i < l1.size() ; i++)
        {
            System.out.print(l1.get(i) + " ");
        }
        System.out.println();


        //Sorting 
        Collections.sort(l1);
        System.out.println(l1);

        // Deleting all
        // l1.clear();
        // System.out.println(l1);

        // searching
        System.out.println(l1.contains("Z"));
    }
}