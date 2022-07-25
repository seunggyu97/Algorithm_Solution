package Java.Programmers.Lv2;

import java.util.Stack;

class Bracket{
    public boolean bracket(String s){
        Stack<String> stack = new Stack<>();

        if(s.charAt(0) == ')') return false;

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '(') stack.push("(");
            else{
                if(stack.isEmpty()) return false;
                else stack.pop();
            }
        }

        return stack.isEmpty();
    }
    public static void main(String[] args){
        String s = "()(())())";
        Bracket sol = new Bracket();

        System.out.println(sol.bracket(s));
    }
}
