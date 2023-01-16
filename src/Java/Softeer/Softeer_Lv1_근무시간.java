package Java.Softeer.WorkTime;

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int answer = 0;
        for(int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            String[] start = st.nextToken().split(":");
            String[] end = st.nextToken().split(":");
            answer += (Integer.parseInt(end[0])*60 + Integer.parseInt(end[1]))
                    - (Integer.parseInt(start[0])*60 + Integer.parseInt(start[1]));
        }

        bw.write(answer + "\n");
        bw.close();
    }
}