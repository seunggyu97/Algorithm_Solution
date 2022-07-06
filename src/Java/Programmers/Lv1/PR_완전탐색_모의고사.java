//import java.util.ArrayList;
//import java.util.Arrays;
//
//class Solution {
//    int[] solution(int[] answers){
//        int a[] = {1,2,3,4,5};
//        int b[] = {2,1,2,3,2,4,2,5};
//        int c[] = {3,3,1,1,2,2,4,4,5,5};
//
//        int[] result = {0, 0, 0};
//        for(int i = 0; i < answers.length; i++) {
//            if(a[i%5] == answers[i]) result[0]++;
//            if(b[i%8] == answers[i]) result[1]++;
//            if(c[i%10] == answers[i]) result[2]++;
//        }
//        int max_value = Math.max(result[0], Math.max(result[1], result[2]));
//
//        ArrayList<Integer> list = new ArrayList<>();
//        if(max_value == result[0]) list.add(1);
//        if(max_value == result[1]) list.add(2);
//        if(max_value == result[2]) list.add(3);
//
//        int[] answer = new int[list.size()];
//        int pt = 0;
//        for(int i : list){
//            answer[pt++] = i;
//        }
//        return answer;
//    }
//
//    public static void main(String[] args){
//        int[] answers = {1,3,2,4,2};
//        Solution sol = new Solution();
//
//        System.out.println(Arrays.toString(sol.solution(answers)));
//    }
//}
