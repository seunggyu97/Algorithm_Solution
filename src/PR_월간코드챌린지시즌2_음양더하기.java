//class Solution{
//    public int solution(int[] absolutes, boolean[] signs){
//        int answer = 0;
//        for(int i = 0; i<absolutes.length; i++){
//            if(!signs[i]) answer += absolutes[i]*-1;
//            else answer += absolutes[i];
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args){
//        int[] absolutes = {4, 7, 12};
//        boolean[] signs = {true, false, true};
//
//        Solution sol = new Solution();
//
//        System.out.println(sol.solution(absolutes, signs));
//    }
//}