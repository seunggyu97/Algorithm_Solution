//import java.util.Arrays;
//import java.util.Collections;
//
//class Solution{
//    public String solution(String s){
//        String[] arr = s.split("");
//        Arrays.sort(arr, Collections.reverseOrder());
//        StringBuilder sb = new StringBuilder();
//
//        for(String i : arr){
//            sb.append(i);
//        }
//        return sb.toString();
//    }
//
//    public static void main(String[] args){
//        String s = "Zbcdefg";
//        Solution sol = new Solution();
//
//        System.out.println(sol.solution(s));
//    }
//}