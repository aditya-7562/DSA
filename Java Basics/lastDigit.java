import java.util.*;


public class lastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int m = Math.abs(n);

        int ans = m%10;

        System.out.println(ans);

        sc.close();
    }
}
