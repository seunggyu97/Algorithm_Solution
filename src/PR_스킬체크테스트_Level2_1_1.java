//import java.util.Arrays;
//
//class Solution {
//    int solution(int[] arr){
//        int answer = 0;
//        if(arr.length == 1) {
//            return arr[0];
//        }
//
//        Arrays.sort(arr);
//        int value = 0;
//        for(int i = 0; i<arr.length; i++){
//            if(i == 0) value = arr[0];
//            int next = arr[i];
//            if(value == next){
//                continue;
//            }
//            int tmp = value, tmp2 = next;
//            while(value != next){
//                if(value < next){
//                    value += tmp;
//                }
//                else {
//                    next += tmp2;
//                }
//            }
//        }
//        return value;
//    }
//
//    public static void main(String[] args){
//        int[] arr = {1, 2, 3};
//        Solution sol = new Solution();
//
//        System.out.println(sol.solution(arr));
//    }
//}
