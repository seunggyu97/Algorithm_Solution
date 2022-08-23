package Java.Baekjoon;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

class StringArrSet{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int answer = 0;

        HashSet<String> hs = new HashSet<>();
        for(int i = 0; i < N; i++){
            hs.add(br.readLine());
        }
        for(int i = 0; i < M; i++){
            if(hs.contains(br.readLine())) answer++;
        }

        System.out.println(answer);
    }
}
