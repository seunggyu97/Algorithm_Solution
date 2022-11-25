package Java.Programmers.Lv1.halloffame;

import java.util.Arrays;

// PriorityQueue로 풀었으면 간단했을걸 그새 깜빡함 ㅠㅠ 공부좀 꾸준히합시다
class Solution{
    public int[] soulution(int k, int[] score){
        int[] answer = new int[score.length];
        int[] arrays = new int[score.length];
        Arrays.fill(arrays, 2001);
        for(int i = 0; i < answer.length; i++){
            if(i < k){
                arrays[i] = score[i];
                answer[i] = Arrays.stream(arrays).min().getAsInt();
                continue;
            }
            Arrays.sort(arrays);
            if(arrays[0] < score[i]){
                arrays[0] = score[i];
                Arrays.sort(arrays);
            }
            answer[i] = arrays[0];
        }
        return answer;
    }

    public static void main(String[] args){
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};

        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.soulution(k,score)));
    }
}
