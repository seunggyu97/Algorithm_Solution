package Java.Softeer.WorkTime;

import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;
        for(int i = 0; i < 5; i++) {
            br = new BufferedReader(new InputStreamReader(System.in));
            String[] arr = br.readLine().split(" ");
            String[] start = arr[0].split(":");
            String[] end = arr[1].split(":");
            answer += Integer.parseInt(end[0])*60 + Integer.parseInt(end[1])
                    - Integer.parseInt(start[0])*60 + Integer.parseInt(start[1]);
        }

        bw.write(answer + "\n");
        bw.close();
    }
}