import java.util.*;

public class AConvergence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            int l = 0, r = n - 1;
            int calls = 0;

            // Each call collapses two extremes
            while (l < r && a[l] != a[r]) {
                calls++;
                l++;
                r--;
            }

            System.out.println(calls);
        }
    }
}
