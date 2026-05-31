import java.util.*;

public class ATheEqualizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long sum = 0;

            for (int i = 0; i < n; i++) {
                sum += sc.nextInt();
            }

            if (sum % 2 == 1 || (long)n * k % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}




// Each move reduces total sum by 1 → total moves = sum of array
// First player wins if total moves are odd
// Special move sets array to k → remaining moves = n * k
// So win if (sum is odd) OR (n * k is even)
