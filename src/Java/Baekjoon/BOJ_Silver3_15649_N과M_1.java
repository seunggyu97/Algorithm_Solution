package Java.Baekjoon;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

class NAndM{
    public static StringBuilder sb = new StringBuilder();
    public static boolean[] visited;
    public static int[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visited = new boolean[N];

        backTracking(N, M, 0);

        System.out.println(sb);
    }

    public static void backTracking(int N, int M, int depth){
        if(depth == M){
            for(int i : arr){
                sb.append(i).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i = 0; i < N; i++){
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = i+1;
                backTracking(N, M, depth + 1);
                visited[i] = false;
            }
        }
    }
}