package Java.Programmers.Lv4.Mukbang;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * 유튭 해설 참조 : https://www.youtube.com/watch?v=4MWxAt4fx5I
 */

class Solution {
    class Food {
        int time;
        int idx;
        Food(int time, int idx) {
            this.time = time;
            this.idx = idx;
        }
    }

    Comparator<Food> CompTime = new Comparator<Food>() {
        @Override
        public int compare(Food o1, Food o2) {
            return o1.time - o2.time;
        }
    };

    Comparator<Food> CompIdx = new Comparator<Food>() {
        @Override
        public int compare(Food o1, Food o2) {
            return o1.idx - o2.idx;
        }
    };

    public int solution(int[] food_times, long k) {
        List<Food> foods = new LinkedList<>();
        int n = food_times.length;
        for(int i = 0; i < n; ++i)
            foods.add(new Food(food_times[i], i+1));

        foods.sort(CompTime);

        int pretime = 0;
        int i = 0;

        for(Food f : foods) {
            long diff = f.time - pretime;
            if(diff != 0) {
                long spend = diff * n;
                if(spend <= k) {
                    k -= spend;
                    pretime = f.time;
                } else {
                    k %= n;
                    foods.subList(i, food_times.length).sort(CompIdx);

                    return foods.get(i + (int)k).idx;
                }
            }
            ++i;
            --n;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] food_times = {3, 1, 2};
        int k = 5;

        Solution sol = new Solution();

        System.out.println(sol.solution(food_times, k));
    }
}