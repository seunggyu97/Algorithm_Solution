package Java.Programmers.Lv2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class LotateMatrixBorder {
    public int[] lotateMatrixBorder(int rows, int columns, int[][] queries){
        int[][] matrix = new int[rows][columns];
        int answer;
        List<Integer> list = new LinkedList<>();
        int p = 1;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix[i][j] = p++;
            }
        }

        for(int[] arr : queries){
            Queue<Integer> q = new LinkedList<>();
            int repeat = (arr[2] - arr[0])*2 + (arr[3] - arr[1])*2;
            int row = arr[0]-1;
            int col = arr[1]-1;
            int min = matrix[row][col];
            int course1 = arr[3] - arr[1];
            int course2 = course1 + arr[2] - arr[0];
            int course3 = course2 + course1 - 1;
            int course4 = course3 + arr[2] - arr[0] - 2;

            for(int i = 0; i<repeat; i++){
                if(i <= course1){
                    q.offer(matrix[arr[0]-1][col++]);
                }
                else if(i <= course2){
                    q.offer(matrix[row++][arr[3]-1]);
                }
                else if(i <= course3){
                    q.offer(matrix[arr[2]-1][col--]);
                }
                else if(i <= course4){
                    q.offer(matrix[row--][arr[3]-1]);
                }
            }
            q.offer(q.poll());

            for(int i = 0; i<repeat; i++){
                if(i<=)
            }
        }
    }

    public static void main(String[] args){
        int rows = 6;
        int columns = 6;
        int[][] queries = {{2,2,5,4,}, {3,3,6,6}, {5,1,6,3}};

        LotateMatrixBorder sol = new LotateMatrixBorder();
        System.out.println(Arrays.toString(sol.lotateMatrixBorder(rows, columns, queries)));
    }
}
