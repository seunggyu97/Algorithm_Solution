//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashSet;
//import java.util.Iterator;
//
//class Solution{
//    public ArrayList<Integer> solution(int[] numbers){
//        ArrayList<Integer> answer = new ArrayList<>();
//        HashSet<Integer> set = new HashSet<>();
//
//        for(int i = 0; i<numbers.length-1; i++){
//            for(int j = i+1; j<numbers.length; j++){
//                set.add(numbers[i] + numbers[j]);
//            }
//        }
//
//        Iterator<Integer> iter = set.iterator();
//        while(iter.hasNext()){
//            answer.add(iter.next());
//        }
//
//        Collections.sort(answer);
//        return answer;
//
//    }
//
//    public static void main(String[] args){
//        int[] numbers = {2,1,3,4,1};
//        Solution sol = new Solution();
//
//        System.out.println(sol.solution(numbers));
//    }
//}