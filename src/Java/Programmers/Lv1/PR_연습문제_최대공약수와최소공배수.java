package Java.Programmers.Lv1;

import java.util.Arrays;

class Solution{
    public long[] solution(int n, int m){
        long[] answer = new long[2];

        if(m%n == 0){
            answer[0] = n;
            answer[1] = m;
        }else{
            for(int i = 1; i<=n; i++){
                if(n%i == 0 && m%i ==0){
                    answer[0] = i;
                }
            }
            answer[1] = n*m/answer[0];
        }
        return answer;
    }

    public static void main(String[] args){
        int n = 3, m = 12;
        Solution sol = new Solution();

        System.out.println(Arrays.toString(sol.solution(n,m)));
    }
}
