package Java;

class Solution{
    public long solution(int n){
        long[] dp;
        // n = 1 -> 1
        // n = 2 -> 2
        // n = 3 -> 3
        // n = 4 -> 5 ... DP문제 : n = (n-1) + (n-2)

        if(n==1) return 1;
        else if(n==2) return 2;
        else{
            dp = new long[n+1];
            dp[1] = 1;
            dp[2] = 2;
            for(int i = 3; i<n+1; i++){
                dp[i] = (dp[i-2] + dp[i-1]) % 1234567;
            }
        }
        return dp[n];
    }

    public static void main(String[] args){
        int n = 1754;
        Solution sol = new Solution();

        System.out.println(sol.solution(n));
    }
}
