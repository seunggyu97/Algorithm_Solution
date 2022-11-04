package Java.Baekjoon;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.IOException;

class NAndM_2{
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        dfs(N, M, 1, 0);

        System.out.println(sb);
    }

    public static void dfs(int N, int M, int num, int depth){
        if(depth == M){
            for(int i : arr){
                sb.append(i).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i = num; i<=N; i++){
            arr[depth] = i;
            dfs(N, M, i+1, depth+1);
        }
    }

}