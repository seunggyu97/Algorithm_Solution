//class Solution{
//    public Long solution(int a, int b){
//        long answer = 0;
//        if(a == b) return (long)a;
//
//        for(int i = Math.min(a, b); i < Math.max(a, b) + 1; i++){
//            answer += i;
//        }
//        return answer;
//    }
//
//    public static void main(String[] args){
//        int a = 5;
//        int b = 3;
//        Solution sol = new Solution();
//        System.out.println(sol.solution(a, b));
//    }
//}