//class Solution{
//    public String solution(String s){
//        StringBuilder sb = new StringBuilder();
//        if(s.length() == 1){
//            return s;
//        }
//        if(s.length() % 2 == 0){
//            sb.append(s.charAt(s.length()/2-1)).append(s.charAt(s.length()/2));
//        }
//        else{
//            sb.append(s.charAt(s.length()/2));
//        }
//        return sb.toString();
//    }
//
//    public static void main(String[] args){
//        String s = "abcde";
//        Solution sol = new Solution();
//
//        System.out.println(sol.solution(s));
//    }
//}