import java.util.Scanner;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(str));
        System.out.println("Length: " + longestPalindrome(str).length());
        sc.close();
    }

    public static String longestPalindrome(String s) {
        int n = s.length();
        if (n == 0) return "";
        boolean[][] dp = new boolean[n][n];
        int start = 0, maxLength = 1;

        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    if (len == 2) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if (dp[i][j] && len > maxLength) {
                    start = i;
                    maxLength = len;
                }
            }
        }
        return s.substring(start, start + maxLength);
    }
}

