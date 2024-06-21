import java.util.*;

class Sample
{
    public static void main(String [] args)
    {
        int[] array = {3, 5, 7, 2, 8, -1, 4, 10, 12};
        int max = Arrays.stream(array).max().getAsInt();
        System.out.println("The maximum value in the array is: " + max);
    }
}