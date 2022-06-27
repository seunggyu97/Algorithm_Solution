//package Java;
//
//import java.util.Arrays;
//
//class Solution{
//    public int[] solution(int[] lottos, int[] win_nums){
//        Arrays.sort(lottos);
//        Arrays.sort(win_nums);
//
//        int zero_count = 0;
//        int high = 7, low = 7;
//        int[] answer = new int[2];
//        for(int i : lottos){
//            if(i != 0) break;
//            zero_count++;
//        }
//        high -= zero_count;
//        for(int i : win_nums){
//            for(int j = zero_count; j<lottos.length; j++){
//                if(i == lottos[j]){
//                    high--;
//                    low--;
//                }
//            }
//        }
//
//        if(high > 6) high = 6;
//        if(low > 6) low = 6;
//
//        answer[0] = high;
//        answer[1] = low;
//
//        return answer;
//    }
//
//    public static void main(String[] args){
//        int[] lottos = {44, 1, 0, 0, 31, 25};
//        int[] win_nums = {31, 10, 45, 1, 6, 19};
//
//        Solution sol = new Solution();
//
//        System.out.println(Arrays.toString(sol.solution(lottos, win_nums)));
//    }
//}