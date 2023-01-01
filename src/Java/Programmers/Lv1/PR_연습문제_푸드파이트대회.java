package Java.Programmers.Lv1.FoodFight;

import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public String solution(int[] food) {
        Deque<Integer> dq = new LinkedList<>();
        StringBuilder answer = new StringBuilder();
        dq.offer(0);

        for(int i = food.length - 1; i > 0; i--){
            if(food[i] > 1) {
                for(int j = 0; j < food[i]/2; j++) {
                    dq.offerFirst(i);
                    dq.offerLast(i);
                }
            }
        }

        for(int i = 0; i < dq.size(); i++) {
            answer.append(dq.pollFirst());
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution(new int[]{1, 3, 4, 6}));
    }
}
