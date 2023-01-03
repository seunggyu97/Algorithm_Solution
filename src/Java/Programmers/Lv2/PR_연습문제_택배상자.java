package Java.Programmers.Lv2.Parcel;

import java.util.Stack;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        int val = 0;
        for(int i = 1; i < order[0]; i++) {
            stack.push(i);
        }
        for(int i : order) {
            if(i == order[0]) {
                answer++;
                val = i+1;
                continue;
            }
            if(i == val) {
                val++;
                answer++;
                continue;
            }
            if(!stack.isEmpty() && i == stack.peek()){
                stack.pop();
                answer++;
                continue;
            }
            if(i >= val) {
                for(int j = val; j < i; j++) {
                    stack.push(j);
                }
                val = i + 1;
                answer++;
            }
            else{
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution(new int[]{4, 3, 1, 2, 5}));
    }
}
