class DP1 {

    public static int fibo(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        return dp[n] = fibo(n - 1, dp) + fibo(n - 2, dp);
    }

    public static void main(String[] arg) {

        int n = 5;
        int[] dp = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            dp[i] = -1;   // correct initialization
        }

        System.out.print(fibo(n, dp));
    }
}
