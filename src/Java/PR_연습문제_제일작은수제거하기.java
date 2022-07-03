//package Java;
//
//import java.util.Arrays;
//
//class Solution{
//    public int[] solution(int[] arr){
//        if(arr.length == 1){
//            return new int[]{-1};
//        }
//
//        int min = 0;
//        for(int i = 0; i<arr.length; i++){
//            if(arr[i] < arr[min]) min = i;
//        }
//
//        int[] answer = new int[arr.length-1];
//        boolean removed = false;
//        for(int i = 0; i<arr.length; i++){
//            if(removed){
//                answer[i-1] = arr[i];
//                continue;
//            }
//            if(i == min){
//                removed = true;
//                continue;
//            }
//            answer[i] = arr[i];
//        }
//        return answer;
//    }
//
//    public static void main(String[] args){
//        int[] arr = {4,1,2,3};
//        Solution sol = new Solution();
//        System.out.println(Arrays.toString(sol.solution(arr)));
//    }
//}
