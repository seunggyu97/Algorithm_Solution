//import java.util.ArrayList;
//import java.util.Arrays;
//
//class Solution{
//    public int[] solution(int[] arr, int divisor){
//        ArrayList<Integer> list = new ArrayList<>();
//        Arrays.sort(arr);
//        for(int i : arr){
//            if(i % divisor == 0){
//                list.add(i);
//            }
//        }
//        if(list.size() == 0) {
//            list.add(-1);
//        }
//        return list.stream().mapToInt(i -> i).toArray();
//    }
//
//    public static void main(String[] args){
//        int[] arr ={5, 9, 7, 10};
//        int divisor = 5;
//        Solution sol = new Solution();
//
//        System.out.println(Arrays.toString(sol.solution(arr, divisor)));
//    }
//}