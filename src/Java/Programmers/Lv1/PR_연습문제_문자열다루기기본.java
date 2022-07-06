//class Solution{
//    public boolean solution(String s){
//        boolean num = true;
//        boolean len = false;
//        if(s.length() == 4 || s.length() == 6) len = true;
//        for(int i = 0; i<s.length(); i++){
//            if(Character.getNumericValue(s.charAt(i)) > 9){
//                num = false;
//                break;
//            }
//        }
//        return (num && len);
//    }
//
//    public static void main(String[] args){
//        String s = "1234";
//        Solution sol = new Solution();
//
//        System.out.println(sol.solution(s));
//    }
//}