package Java.Programmers.Lv2;

import java.util.LinkedList;
import java.util.Queue;

class EqualSumQueue{
    public int equalSumQueue(int[] queue1, int[] queue2){
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        int answer = -1;
        long sum1 = 0, sum2 = 0;
        for(int i = 0; i < queue1.length; i++){
            sum1 += queue1[i];
            sum2 += queue2[i];
            q1.offer(queue1[i]);
            q2.offer(queue2[i]);
        }

        if((sum1 + sum2) % 2 == 1) return -1;

        for(int i = 0; i <= (queue1.length + queue2.length)*2; i++){
            if(sum1 > sum2){
                int tmp = q1.poll();
                q2.offer(tmp);
                sum1 -= tmp;
                sum2 += tmp;
            }
            else if(sum1 < sum2){
                int tmp = q2.poll();
                q1.offer(tmp);
                sum1 += tmp;
                sum2 -= tmp;
            }
            else{
                answer = i+1;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        int[] queue1 = {3, 2, 7, 2};
        int[] queue2 = {4, 6, 5, 1};

        EqualSumQueue sol = new EqualSumQueue();
        System.out.println(sol.equalSumQueue(queue1, queue2));
    }
}
