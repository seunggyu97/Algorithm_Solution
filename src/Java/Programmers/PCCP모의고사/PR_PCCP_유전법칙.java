package Java.Programmers.PCCP모의고사;

import java.util.Arrays;
import java.util.Stack;

class Generation{
    public String[] generation(int[][] queries){
        String[] answer = new String[queries.length];
        for(int i = 0; i < queries.length; i++){
            String result;
            int n = queries[i][0];
            int p = queries[i][1] - 1;

            Stack<Integer> stack = new Stack<>();

            while(n > 1){
                stack.push(p%4);
                n -= 1;
                p /= 4;
            }

            result = "Rr";
            while(!stack.isEmpty()){
                int num = stack.pop();
                if(num == 0) {
                    result = "RR";
                    break;
                }
                if(num == 3){
                    result = "rr";
                    break;
                }
            }

            answer[i] = result;
        }
        return answer;
    }

    public static void main(String[] args){
        int[][] queries = {{3, 8}, {2, 2}};

        Generation sol = new Generation();
        System.out.println(Arrays.toString(sol.generation(queries)));
    }
}
