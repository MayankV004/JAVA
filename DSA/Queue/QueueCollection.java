import java.util.*;

class QueueCollection
{
    public static void main(String [] args)
    {
        // Queue <Integer> q = new LinkedList<>();
        Queue <Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q);

        q.remove();
        System.out.println(q);
       // q.Display();
    }
}