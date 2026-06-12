import java.util.*;

public class BPalindromeTwelveAndTwoTerms {
    static boolean isPalindrome(long x) {
        long rev = 0, t = x;
        while (t > 0) {
            rev = rev * 10 + (t % 10);
            t /= 10;
        }
        return rev == x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            boolean found = false;

            // Try palindromes from 0 to 1000
            for (long a = 0; a <= 1000; a++) {
                if (isPalindrome(a)) {
                    long b = n - a;
                    if (b >= 0 && b % 12 == 0) {
                        System.out.println(a + " " + b);
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
