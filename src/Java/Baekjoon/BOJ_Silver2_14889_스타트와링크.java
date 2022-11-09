package Java.Baekjoon.Startlink;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main{
    static int answer = Integer.MAX_VALUE;
    static int N;
    static int[][] S;
    static boolean[] pick;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = new int[N][N];
        pick = new boolean[N];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                S[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);

        System.out.println(answer);
    }

    public static void dfs(int cur, int pick_count){
        if(pick_count == N/2){
            update();
            return;
        }

        for(int i = cur; i < N; i++){
            pick[i] = true;
            dfs(i+1, pick_count+1);
            pick[i] = false;
        }
    }

    // 두 팀의 능력치 차이를 계산
    public static void update(){
        int team_start = 0;
        int team_link = 0;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                // i 번째 사람과 j 번째 사람이 true라면 스타트팀으로 점수 플러스
                if (pick[i] && pick[j]) {
                    team_start += S[i][j];
                    team_start += S[j][i];
                }
                // i 번째 사람과 j 번째 사람이 false라면 링크팀으로 점수 플러스
                else if (!pick[i] && !pick[j]) {
                    team_link += S[i][j];
                    team_link += S[j][i];
                }
            }
        }

        int val = Math.abs(team_start - team_link);

        if (val == 0) {
            System.out.println(val);
            System.exit(0);
        }

        answer = Math.min(val, answer);
    }
}
