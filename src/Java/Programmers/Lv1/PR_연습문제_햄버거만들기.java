package Java.Programmers.Lv1.Burger;

import java.util.Stack;

class Solution {

    public int solution(int[] ingredient) {
        int answer = 0;
        Stack stack = new Stack();

        for(int i : ingredient) {
            if(stack.size() == 0) {
                if(i == 1) {
                    stack.push(i);
                }
                continue;
            }
            switch (i) {
                case 2 :
                    if(stack.peek().equals(1)) stack.push(2);
                    else stack.clear();
                    break;
                case 3 :
                    if(stack.peek().equals(2)) stack.push(3);
                    else stack.clear();
                    break;
                case 1 :
                    if(stack.peek().equals(3)){
                        answer++;
                    }
                    stack.clear();
                    stack.push(1);
                    break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}));
    }
}
