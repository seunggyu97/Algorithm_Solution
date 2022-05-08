//class Solution {
//    int solution(int n1){
//        long n = n1;
//        int answer = 0;
//        if(n==0) return -1;
//        if(n==1) return 0;
//        while(true){
//            if(answer==500){
//                answer = -1;
//                break;
//            }
//            if(n%2 == 0) n /= 2;
//            else n = n*3+1;
//            answer++;
//            if(n==1) break;
//        }
//        return answer;
//    }
//
//
//
//    public static void main(String[] args){
//        int n = 1;
//        Solution sol = new Solution();
//
//        System.out.println(sol.solution(n));
//    }
//}
