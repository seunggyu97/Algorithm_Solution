package Java.Baekjoon.NQueen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    static int answer = 0;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];

        backTracking(N, 0);
        System.out.println(answer);
    }

    public static void backTracking(int N, int depth) {
        if(N==depth){
            answer++;
            return;
        }

        for(int i = 0; i < N; i++){
            arr[depth] = i;
            // depth는 열 순서, i는 행 순서

            if(isPossible(depth)){
                backTracking(N, depth+1);
            }
        }
    }

    public static boolean isPossible(int depth){
        for(int i =0; i<depth; i++){
            if(arr[i] == arr[depth] || Math.abs(depth - i) == Math.abs(arr[depth]-arr[i])) return false;
        }

        return true;
    }
}
