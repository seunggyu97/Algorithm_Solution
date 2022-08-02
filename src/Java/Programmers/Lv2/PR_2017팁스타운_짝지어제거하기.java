package Java.Programmers.Lv2;

import java.util.Stack;

class RemoveCouple
{
    public int removecouple(String s)
    {
        int answer = -1;
        Stack<Character> stack = new Stack<>();
        for (int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }else{
                stack.push(c);
            }

        }
        answer = (stack.size() == 0) ? 1 : 0;
        return answer;
    }

    public static void main(String[] args) {
        String s = "cdcd";

        RemoveCouple sol = new RemoveCouple();
        System.out.println(sol.removecouple(s));
    }
}