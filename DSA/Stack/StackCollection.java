import java.util.*;

class StackCollection
{
    public static void main (String [] args)
    {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s);
        s.pop();
        System.out.println(s);

        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}