package Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class BOJ_Silver1_1931 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[][] meetings = new int[N][2];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());

            meetings[i][0] = Integer.parseInt(st.nextToken());
            meetings[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(meetings, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[1]-o1[0]) - (o2[1]-o2[0]);
            }
        });

        int[] time = new int[24];
        int count = 0;
        for(int[] arr : meetings){
            boolean flag = false;
            for(int i = arr[0]; i<arr[1]; i++){
                if(time[i] == 1) flag = true;
            }
            if(time[arr[0]] == 0 && !flag){

                for(int i = arr[0]; i < arr[1]; i++){
                    time[i] = 1;
                }
                count++;
            }
        }
        System.out.println(count);
    }
}
