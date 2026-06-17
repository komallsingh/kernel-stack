import java.util.Scanner;

public class AOptimalPurchase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long a=sc.nextLong();
            long b=sc.nextLong();
            long ans=0;
                long a1=n*a;
                long x=n/3;
                long rem=n%3;
                long a2=x*b+Math.min(rem*a, b);
                ans=Math.min(a1,a2);
                System.out.println(ans);
        }
    }
}
