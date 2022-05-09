//class Solution {
//    public boolean solution(int x){
//        int sum = 0;
//        String str = Integer.toString(x);
//        for(int i = 0; i < str.length(); i++){
//            sum += Character.getNumericValue(str.charAt(i));
//        }
//
//        return (x % sum == 0);
//    }
//
//    public static void main(String[] args){
//        int x = 10;
//        Solution sol = new Solution();
//
//        System.out.println(sol.solution(x));
//    }
//}
