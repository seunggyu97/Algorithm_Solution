//import java.util.ArrayList;
//
//class Solution {
//    int solution(int left, int right){
//        int answer = 0;
//        for(int i = left; i <= right; i++){
//            ArrayList<Integer> list = new ArrayList<>();
//            for(int j = 1; j<= i; j++){
//                if(i%j == 0){
//                    list.add(j);
//                }
//            }
//            if(list.size() % 2 == 0)  answer += i;
//            else answer -= i;
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args){
//        int left = 13;
//        int right = 17;
//        Solution sol = new Solution();
//
//        System.out.println(sol.solution(left, right));
//    }
//}
