package Java.Baekjoon.putOperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    static int[] arr;
    static int[] operation;
    static int N;
    static int MAX = Integer.MIN_VALUE;
    static int MIN = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        arr = new int[N];
        operation = new int[4];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<4; i++){
            operation[i] = Integer.parseInt(st.nextToken());
        }

        dfs(arr[0], 1);

        System.out.println(MAX);
        System.out.println(MIN);
    }

    public static void dfs(int num, int idx){
        if(idx == N){
            MAX = Math.max(MAX, num);
            MIN = Math.min(MIN, num);
            return;
        }

        for(int i = 0; i < 4; i++){
            if(operation[i] > 0){
                operation[i]--;
                switch (i){
                    case 0 :
                        dfs(num + arr[idx], idx + 1);
                        break;
                    case 1 :
                        dfs(num - arr[idx], idx + 1);
                        break;
                    case 2 :
                        dfs(num * arr[idx], idx + 1);
                        break;
                    case 3 :
                        dfs(num / arr[idx], idx + 1);
                        break;
                }

                operation[i]++;
            }
        }
    }
}