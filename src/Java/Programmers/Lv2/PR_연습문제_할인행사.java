package Java.Programmers.Lv2.Event;

import java.util.HashMap;

class Solution {
    HashMap<String, Integer> hm = new HashMap<>();

    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        for (int i = 0; i < discount.length - 9; i++) {
            for (int j = i; j < i + 10; j++) {
                hm.put(discount[j], hm.getOrDefault(discount[j], 0) + 1);
            }
            if (check(want, number)) {
                answer++;
            }
            hm.clear();
        }

        return answer;
    }

    public boolean check(String[] want, int[] number) {
        for (int i = 0; i < want.length; i++) {
            if (!hm.containsKey(want[i]) || hm.get(want[i]) != number[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution(new String[]{"banana", "apple", "rice", "pork", "pot"},
                new int[]{3, 2, 2, 2, 1},
                new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"}));
    }
}