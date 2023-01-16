package Java.Softeer.Lupin;

import java.util.*;
import java.io.*;

class Main
{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int w = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][2];
        int answer = 0;

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); // 무게
            arr[i][1] = Integer.parseInt(st.nextToken()); // 가격
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });

        for(int[] mArr : arr) {
            if(w <= 0) break;
            if(w < mArr[0]) {
                answer += w * mArr[1];
                break;
            }
            else {
                answer += mArr[0] * mArr[1];
                w -= mArr[0];
            }
        }

        bw.write(answer + "\n");
        bw.close();
    }
}