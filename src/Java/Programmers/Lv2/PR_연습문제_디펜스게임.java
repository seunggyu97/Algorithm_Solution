package Java.Programmers.Lv2.DefenseGame;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = enemy.length;
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < enemy.length; i++) {
            n -= enemy[i];
            pq.add(enemy[i]);

            if (n < 0) {
                if (k > 0 && !pq.isEmpty()) {
                    n += pq.poll();
                    k--;
                }
                else {
                    answer = i;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 7;
        int k = 3;
        int[] enemy = {4, 2, 4, 5, 3, 3, 1};

        Solution sol = new Solution();

        System.out.println(sol.solution(n, k, enemy));
    }
}
