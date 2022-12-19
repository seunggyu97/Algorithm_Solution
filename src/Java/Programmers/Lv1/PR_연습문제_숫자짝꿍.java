package Java.Programmers.Lv1.CoupleNumber;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public String solution(String X, String Y) {
        String answer = "-1";
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[10];
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for(char ch : X.toCharArray()){
            arr[Character.getNumericValue(ch)]++;
        }
        for(char ch : Y.toCharArray()){
            if(arr[Character.getNumericValue(ch)] != 0) {
                pq.add(Character.getNumericValue(ch));
                arr[Character.getNumericValue(ch)]--;
            }
        }
        if(!pq.isEmpty() && pq.peek() == 0) {
            return "0";
        }
        while(!pq.isEmpty()) {
            sb.append(pq.poll().toString());
        }

        if(sb.length() != 0) answer = sb.toString();
        return answer;
    }

    public static void main(String[] args){
        String X = "5525";
        String Y = "1255";

        Solution sol = new Solution();
        System.out.println(sol.solution(X, Y));
    }
}