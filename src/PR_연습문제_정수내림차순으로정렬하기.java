//import java.util.Arrays;
//import java.util.Collections;
//
//class Solution {
//    long solution(long n){
//        StringBuilder sb = new StringBuilder();
//
//        String[] array = Long.toString(n).split("");
//        Arrays.sort(array, Collections.reverseOrder());
//
//        for(String num : array){
//            sb.append(num);
//        }
//
//        return Long.parseLong(sb.toString());
//    }
//
//    public static void main(String[] args){
//        int n = 118372;
//        Solution sol = new Solution();
//
//        System.out.println(sol.solution(n));
//
//    }
//}
