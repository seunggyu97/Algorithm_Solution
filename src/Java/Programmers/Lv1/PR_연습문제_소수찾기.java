//class Solution {
//    public int solution(int n){
//        int answer = 1;
//        // 2, 3, 4, 5, 6, 7, 8, 9, 10
//        for(int i = 3; i <= n; i++){
//            int count = 0;
//            for(int j = 2; j <= Math.sqrt(i); j++){
//                if(i % j == 0) {
//                    count++;
//                    break;
//                }
//            }
//            if(count == 0) answer++;
//        }
//
//        return answer;
//    }
//    public static void main(String[] args){
//        int n = 10;
//        Solution sol = new Solution();
//
//        System.out.println(sol.solution(n));
//    }
//}
