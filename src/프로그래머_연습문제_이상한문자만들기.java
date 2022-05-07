//class Solution {
//    String solution(String s){
//        int n = s.length();
//        StringBuilder sb = new StringBuilder();
//
//        String[] str = s.split(" ");
//        for(int i = 0; i<str.length; i++){
//            for(int j = 0; j<str[i].length(); j++) {
//                if (j % 2 != 0) {
//                    sb.append(Character.toLowerCase(str[i].charAt(j)));
//                } else {
//                    sb.append(Character.toUpperCase(str[i].charAt(j)));
//                }
//            }
//            if(i != str.length-1) sb.append(" ");
//        }
//        int tmp = s.length()-1;
//        while(s.charAt(tmp--) == ' ') sb.append(" ");
//        return sb.toString();
//    }
//    public static void main(String[] args){
//        String s = "try hello world";
//        Solution sol = new Solution();
//
//        System.out.println(sol.solution(s));
//    }
//}
