package Java.Baekjoon;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

class NAndM_3{
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[M];

        dfs(N, M, 0);
        System.out.println(sb);
    }

    public static void dfs(int N, int M, int depth){
        // 탈출 조건
        if(depth == M){
            for(int i : arr){
                sb.append(i).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i = 0; i<N; i++){
            arr[depth] = i+1;
            dfs(N, M, depth + 1);
        }
    }
}