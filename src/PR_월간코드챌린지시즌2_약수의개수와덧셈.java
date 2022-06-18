//class Solution{
//    public int solution(int left, int right){
//        int count = 0;
//
//        for(int i = left; i< right+1; i++){
//            int tmp = 0;
//            for(int j = 1; j<=i; j ++){
//                if(i%j == 0) tmp ++;
//            }
//            if(tmp % 2 == 0) count += i;
//            else count -= i;
//        }
//        return count;
//    }
//    public static void main(String[] args){
//        int left = 13;
//        int right = 17;
//
//        Solution sol = new Solution();
//        System.out.println(sol.solution(left, right));
//    }
//}