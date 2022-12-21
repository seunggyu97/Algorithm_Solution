package Java.Programmers.Lv1.Coke;

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n>=a) {
            int t = n/a*b;
            n = n%a + t;
            answer += t;
        }

        return answer;
    }

    public static void main(String[] args){
        int a = 3;
        int b = 1;
        int n = 20;

        Solution sol = new Solution();
        System.out.println(sol.solution(a, b, n));
    }
}
