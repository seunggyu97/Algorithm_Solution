package Java.Programmers.Lv1.Fruit;

import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for(int i = score.length-1; i >= score.length%m; i--){
            i -= m-1;
            answer += score[i]*m;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1}));
    }
}
