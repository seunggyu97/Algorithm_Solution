package Java.Baekjoon.Sudoku;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int[][] arr = new int[9][9];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int row = 0; row<9; row++){
            st = new StringTokenizer(br.readLine());
            for(int col = 0; col<9; col++){
                arr[row][col] = Integer.parseInt(st.nextToken());
            }
        }

        backTracking(0, 0);
    }

    public static void backTracking(int row, int col){
        if(col == 9){
            // 한 행이 다 채워졌을 경우

            // 다음 행의 첫 번째 열부터 다시 시작
            backTracking(row+1, 0);

            return;
        }

        if(row == 9){
            // 모든 검사가 완료됐을 때
            // 출력

            for(int i = 0; i < 9; i++){
                for(int j = 0; j < 9; j++){
                    sb.append(arr[i][j]).append(' ');
                }
                sb.append('\n');
            }

            System.out.println(sb);
            System.exit(0);
        }

        if(arr[row][col] == 0){
            // 해당 위치가 0이라면 가능성 검사 시작
            for(int i = 0; i<9; i++){
                if(isPossible(row, col, i)){
                    arr[row][col] = i;
                    backTracking(row, col+1);
                }
            }
        }

        backTracking(row, col+1);
    }

    public static boolean isPossible(int row, int col, int value){
        // 가로 검사
        for(int i = 0; i < 9; i++){
            if(arr[row][i] == value) return false;
        }

        // 세로 검사
        for(int i = 0; i<9; i++){
            if(arr[i][col] == value) return false;
        }

        // 3x3 내부 검사
        int set_row = (row/3) * 3; // value가 속한 3x3 행의 첫 위치
        int set_col = (col/3) * 3; // value가 속한 3x3 열의 첫 위치
        for(int i = set_row; i < set_row+3; i++){
            for(int j = set_col; j < set_col+3; j++){
                if(arr[i][j] == value) return false;
            }
        }

        return true;
    }
}
