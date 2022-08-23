package Java.Baekjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.HashMap;
class CompressionCoordinate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> hm = new HashMap<>();
        int rank = 0;
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int[] sorted = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            arr[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sorted);

        for(int i : sorted){
            if(!hm.containsKey(i)){
                hm.put(i, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i : arr){
            sb.append(hm.get(i)).append(" ");
        }

        System.out.println(sb);
    }
}
