package Java.Baekjoon;

import java.io.*;
import java.util.*;

class NeverSeenAndNeverBeHeard{
    public void neverSeenAndNeverBeHeard() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> hm = new HashMap<>();

        for(int i = 0; i<N; i++){
            String name = br.readLine();
            hm.put(name, 1);
        }

        for(int i = 0; i<M; i++){
            String name = br.readLine();
            hm.put(name, hm.getOrDefault(name, 0)+1);
        }

        TreeMap<String, Integer> tm = new TreeMap<>(hm);
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, Integer> entry : tm.entrySet()){
            if(entry.getValue() == 2){
                count++;
                sb.append(entry.getKey()).append("\n");
            }
        }
        System.out.println(count);
        System.out.println(sb);

    }

    public static void main(String[] args) throws IOException{
        NeverSeenAndNeverBeHeard sol = new NeverSeenAndNeverBeHeard();

        sol.neverSeenAndNeverBeHeard();
    }
}
