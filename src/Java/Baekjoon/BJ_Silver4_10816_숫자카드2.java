package Java.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;

class NumberCard2{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        HashMap<String, Integer> hm = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            String str = st.nextToken();
            hm.put(str, hm.getOrDefault(str, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        int[] answer = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            String str = st.nextToken();

            if(hm.get(str) != null){
                answer[i] = hm.get(str);
            }else answer[i] = 0;
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<M; i++){
            if(i != 0) sb.append(" ");
            sb.append(answer[i]);
        }

        System.out.println(sb);
    }
}
