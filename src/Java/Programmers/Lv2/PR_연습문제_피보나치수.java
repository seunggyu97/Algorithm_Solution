package Java.Programmers.Lv2;

class Fibonacci{
    static Long[] dp;
    public Long fibonacci(int n){
        dp = new Long[n+1];

        dp[0] = 0L;
        dp[1] = dp[2] = 1L;

        if(n < 3) return dp[n];

        return recur(n);
    }

    public Long recur(int num){
        if(dp[num] == null){
            dp[num] = recur(num - 2) + recur(num - 1);
        }
        return dp[num] % 1234567;
    }

    public static void main(String[] args){
        int n = 99999;
        Fibonacci sol = new Fibonacci();

        System.out.println(sol.fibonacci(n));
    }
}