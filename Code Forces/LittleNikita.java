import java.util.Scanner;

public class LittleNikita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if ((n>=m) && (n - m) % 2 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
