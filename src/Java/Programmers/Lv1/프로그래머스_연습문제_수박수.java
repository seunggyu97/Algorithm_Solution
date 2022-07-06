//class Solution {
//    public String solution(int n){
//        StringBuilder sb = new StringBuilder();
//
//        if(n == 0) return "";
//        sb.append("수");
//        while(n-- > 1){
//            if(sb.charAt(sb.length()-1) == '수'){
//                sb.append("박");
//            }
//            else{
//                sb.append("수");
//            }
//        }
//
//        return sb.toString();
//    }
//    public static void main(String[] args){
//        int n = 3;
//        Solution sol = new Solution();
//
//        System.out.println(sol.solution(n));
//    }
//}
