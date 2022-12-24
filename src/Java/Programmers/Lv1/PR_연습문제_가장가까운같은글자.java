package Java.Programmers.Lv1.Nearest;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(hm.getOrDefault(ch, -1) == -1) {
                answer[i] = -1;
                hm.put(ch, i);
                continue;
            }
            answer[i] = i - hm.get(ch);
            hm.put(ch, i);
        }

        return answer;
    }

    public static void main(String[] args){
        String s = "banana";
        Solution sol = new Solution();

        System.out.println(Arrays.toString(sol.solution(s)));
    }
}
