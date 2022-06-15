//import java.util.HashMap;
//import java.util.Map;
//
//class Solution {
//    public int solution(int[] numbers) {
//        HashMap<Integer, Boolean> hm = new HashMap<>();
//        int answer = 0;
//        for(int i = 0; i<10; i++){
//            hm.put(i, false);
//        }
//        for(int i: numbers){
//            hm.put(i,true);
//        }
//        for(Map.Entry<Integer, Boolean> i : hm.entrySet()){
//            if(!i.getValue()){
//                answer += i.getKey();
//            }
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        int[] numbers = {1,2,3,4,5,6,7,8,0};
//        Solution sol = new Solution();
//
//        System.out.println(sol.solution(numbers));
//    }
//}