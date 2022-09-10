package Java.Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class BOJ_Silver3_1463 {

    static Integer[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        dp = new Integer[N + 1];
        dp[0] = 0;
        dp[1] = 0;

        System.out.print(findMinToOne(N));
    }

    static int findMinToOne(int N) {

        if (dp[N] == null) {
            if (N % 6 == 0) {
                dp[N] = Math.min(findMinToOne(N - 1), Math.min(findMinToOne(N / 3), findMinToOne(N / 2))) + 1;
            }
            else if (N % 3 == 0) {
                dp[N] = Math.min(findMinToOne(N / 3), findMinToOne(N - 1)) + 1;
            }
            else if (N % 2 == 0) {
                dp[N] = Math.min(findMinToOne(N / 2), findMinToOne(N - 1)) + 1;
            }
            else {
                dp[N] = findMinToOne(N - 1) + 1;
            }
        }
        return dp[N];
    }
}
