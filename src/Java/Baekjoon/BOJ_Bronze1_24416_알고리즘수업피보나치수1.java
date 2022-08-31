package Java.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class fibonacciDp{
    static int count = 0;
    static int dpCount = 0;
    static int[] f;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        f = new int[n];

        fib(n);
        fibonacci(n);

        sb.append(count).append(" " + dpCount);

        System.out.println(sb);
    }

    public static int fib(int n){
        if(n == 1 || n == 2) {
            count++;
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public static int fibonacci(int n){
        f[0] = 1;
        f[1] = 1;

        for(int i = 2; i < n; i++){
            dpCount++;
            f[i] = f[i-1] + f[i-2];
        }

        return f[n-1];
    }
}
