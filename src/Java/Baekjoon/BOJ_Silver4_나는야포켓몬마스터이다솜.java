package Java.Baekjoon;

import java.io.*;
import java.util.StringTokenizer;
import java.util.HashMap;

class PoketmonMaster{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, String> hm = new HashMap<>();

        for(int i = 0; i < N; i++){
            String tmp = br.readLine();
            hm.put(Integer.toString(i+1), tmp);
            hm.put(tmp, Integer.toString(i+1));
        }

        for(int i = 0; i < M; i++) {
            bw.write(hm.get(br.readLine()) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
