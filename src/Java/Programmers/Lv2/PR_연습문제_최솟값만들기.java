package Java.Programmers.Lv2;

import java.util.Collections;
import java.util.PriorityQueue;

class MakeMin{
    public int makeMin(int[] A, int[] B){
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        int result = 0;

        for(int i = 0; i<A.length; i++){
            pq1.offer(A[i]);
            pq2.offer(B[i]);
        }
        for(int i = 0; i<A.length; i++){
            result += pq1.poll()*pq2.poll();
        }

        return result;
    }
    public static void main(String[] args){
        int[] A = {1, 2};
        int[] B = {3, 4};
        MakeMin sol = new MakeMin();

        System.out.println(sol.makeMin(A, B));
    }
}
