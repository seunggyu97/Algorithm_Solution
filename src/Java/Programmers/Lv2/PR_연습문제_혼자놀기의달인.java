package Java.Programmers.Lv2.PlayAlone;

import java.util.ArrayList;
import java.util.Comparator;

class Solution {

    int count;
    int[] cards;
    ArrayList<Integer> list = new ArrayList<>();

    public int solution(int[] cards) {
        this.cards = cards;

        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == -1) continue;
            count = 1;
            int j = cards[i];
            cards[i] = -1;
            bfs(j - 1);
            list.add(count);
        }

        // 최고 점수를 구하기 위해 내림차순으로 정렬
        list.sort(Comparator.reverseOrder());

        return list.size() == 1 ? 0 : list.get(0) * list.get(1);
    }

    public void bfs(int idx) {
        if(cards[idx] == -1) return;

        int t = cards[idx];
        cards[idx] = -1;
        count++;
        bfs(t - 1);
    }

    public static void main(String[] args) {
        int[] cards = {8,6,3,7,2,5,1,4};
        Solution sol = new Solution();

        System.out.println(sol.solution(cards));
    }
}
