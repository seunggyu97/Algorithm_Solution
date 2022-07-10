package Java.Programmers.Lv2;

import java.util.PriorityQueue;

class MoreHot{
    public int moreHot(int[] scoville, int K){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int count = 0;
        if(K == 0) return 0;
        for(int i : scoville){
            pq.offer(i);
        }
        while(pq.size() > 1 && pq.peek() < K){
            count++;
            int newScoville = pq.poll() + pq.poll()*2;
            pq.offer(newScoville);
        }

        if(pq.size() <= 1 && pq.peek() < K)
            count = -1;

        return count;
    }
    public static void main(String[] args){
        int[] scoville = {1,2,3,9,10,12};
        int K = 7;
        MoreHot sol = new MoreHot();

        System.out.println(sol.moreHot(scoville, K));
    }
}