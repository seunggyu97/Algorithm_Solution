//class Solution {
//    public String solution(String phone_number){
//        int pLength = phone_number.length();
//        String pn = phone_number.substring(pLength-4);
//        String answer = "";
//        for(int i = 0; i<pLength-4; i++){
//            answer += "*";
//        }
//        return answer + pn;
//    }
//
//    public static void main(String[] args){
//        String phone_number = "01033334444";
//        Solution sol = new Solution();
//
//        System.out.println(sol.solution(phone_number));
//    }
//}
