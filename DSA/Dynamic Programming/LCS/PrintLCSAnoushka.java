class PrintLCSAnoushka {
    private static void PrintLCS(String s1 , String s2 , int n , int m)
    {
        // Create a 2D DP (Dynamic Programming) table with dimensions (n+1) x (m+1)
        String[][] dp = new String[n + 1][m + 1];

        // Initialize the DP table with empty strings
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = ""; // Base case: If either string is empty, LCS is an empty string.
            }
        }

        // Fill in the DP table using a bottom-up approach
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    // If the current characters match, add the character to the LCS of the previous substrings.
                    dp[i][j] = dp[i - 1][j - 1] + s1.charAt(i - 1);
                } else {
                    // If the current characters do not match, take the longer LCS from the previous substrings.
                    dp[i][j] = (dp[i - 1][j].length() > dp[i][j - 1].length()) ? dp[i - 1][j] : dp[i][j - 1];
                }
            }
        }

        // Print the Longest Common Subsequence
        System.out.println(dp[n][m]);
    }
    public static void main(String[] args) {
        String s1 = "abdefjs";
        String s2 = "xadfsx";
        int n = s1.length();
        int m = s2.length();
        PrintLCS(s1,s2,n,m);

        
    }
}