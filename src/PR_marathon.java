//
//import java.util.Arrays;
//import java.util.HashMap;
//
//class Solution {
//    public String solution(String[] participant, String[] completion) {
//        String answer = "";
//
//        // sort/loop 방법
//        /*// participant를 정렬한다.
//        Arrays.sort(participant);
//        // completion을 정렬한다.
//        Arrays.sort(completion);
//        // 두 배열의 같은 위치에 있는 값들을 비교한다.
//        for(int i = 0; i< completion.length; i++){
//            // 만약 값이 다르다면 participant의 값이 답
//            if(!participant[i].equals(completion[i])){
//                answer = participant[i];
//                break;
//            }else{
//                // completion의 끝까지 돌았는데 다른 값이 나오지 않으면 participant의 마지막 값이 답
//                answer = participant[i+1];
//            }
//        }*/
//
//        // HashMap 방법
//
//        HashMap<String, Integer> hm = new HashMap<>();
//        // 동명이인 처리를 위해 getOrDefault사용
//        for(String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
//        for(String player : completion) hm.put(player, hm.get(player) - 1);
//
//        for(String key : hm.keySet()){
//            if(hm.get(key) != 0){
//                answer = key;
//            }
//        }
//        return answer;
//    }
//
//    public static void main(String[] args){
//        Solution sol = new Solution();
//        String[] participant = {"leo", "kiki", "eden"};
//        String[] completion = {"eden", "kiki"};
//
//        System.out.println(sol.solution(participant, completion));
//    }
//}
