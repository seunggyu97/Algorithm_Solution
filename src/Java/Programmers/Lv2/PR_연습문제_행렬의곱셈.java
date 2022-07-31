package Java.Programmers.Lv2;

import java.util.Arrays;

class MultiplyArray {
    public int[][] multiplyArray(int[][] arr1, int[][] arr2){
        int[][] answer = new int[arr1.length][arr2[0].length];

        for(int i = 0; i<arr1.length; i++){
            for(int j = 0; j<arr2[0].length; j++){
                for(int k = 0; k<arr1[0].length; k++){
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return answer;
    }

    public static void main(String[] args){
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};

        MultiplyArray sol = new MultiplyArray();
        System.out.println(Arrays.deepToString(sol.multiplyArray(arr1, arr2)));
    }
}