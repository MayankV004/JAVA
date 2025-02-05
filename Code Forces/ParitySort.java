import java.util.Arrays;
import java.util.Scanner;

public class ParitySort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]= sc.nextInt();
                b[i]=a[i];
            }
            Arrays.sort(a);
            boolean flag=true;

            for(int i=0;i<n;i++){
            // here checking that after sorting the array is it preserving the even odd order of elements eg , for preserving both has to be either Even ot odd
            // if any one of them is of different , Flag == False 
            // means No
                if(a[i]%2!=b[i]%2){
                    flag=false;
                    break;
                }
            }
            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
