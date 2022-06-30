package Java;

import java.util.Arrays;

class Solution{
    public int solution(int[][] sizes){
        int first = 0, second = 0;

        for(int[] arr : sizes){
            Arrays.sort(arr);
            if(arr[0] > first) first = arr[0];
            if(arr[1] > second) second = arr[1];
        }
        return first*second;
    }

    public static void main(String[] args){
        int[][] sizes = {{60, 50}, {30,70}, {60, 30},{80, 40}};
        Solution sol = new Solution();
        System.out.println(sol.solution(sizes));
    }
}
