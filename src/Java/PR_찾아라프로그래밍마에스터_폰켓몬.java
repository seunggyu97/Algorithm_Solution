package Java;

import java.util.HashSet;
import java.util.Set;

class Solution{
    public int solution(int[] nums){
        int answer = 0;
        int half = nums.length/2;
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        if(half <= set.size()) answer = half;
        else answer = set.size();
        return answer;
    }

    public static void main(String[] args){
        int[] nums = {3,1,2,3};

        Solution sol = new Solution();

        System.out.println(sol.solution(nums));
    }
}