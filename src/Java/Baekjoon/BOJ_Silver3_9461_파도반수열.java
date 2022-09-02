package Java.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PadovanSequence {
    static Long[] dp = new Long[101];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        dp[0] = 0L;
        dp[1] = 1L;
        dp[2] = 1L;
        dp[3] = 1L;

        int T = Integer.parseInt(br.readLine());

        while(T-- > 0){
            int N = Integer.parseInt(br.readLine());
            System.out.println(padovan(N));
        }
    }
    public static long padovan(int N) {
        if(dp[N] == null) {	// 탐색하지 않은 인덱스일 경우 재귀호출
            dp[N] = padovan(N - 2) + padovan(N - 3);
        }
        return dp[N];
    }
}
