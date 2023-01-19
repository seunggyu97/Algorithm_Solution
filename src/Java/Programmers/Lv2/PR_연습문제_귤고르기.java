package Java.Programmers.Lv2.Tangerine;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0, count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i : tangerine) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        List<Integer> keyset = new ArrayList<>(hm.keySet());

        keyset.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return hm.get(o2).compareTo(hm.get(o1));
            }
        });

        for(int i : keyset) {
            if(count >= k) break;
            count += hm.get(i);
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int k = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};

        Solution sol = new Solution();

        System.out.println(sol.solution(k, tangerine));
    }
}