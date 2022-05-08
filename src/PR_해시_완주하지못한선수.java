import java.util.HashMap;
import java.util.Map;

class Solution {
    String solution(String[] participant, String[] completion){
        /* sort 후 loop 방법 */
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//
//        for(int i = 0; i < completion.length; i++){
//            if(!participant[i].equals(completion[i])){
//                return participant[i];
//            }
//        }
//        return participant[participant.length-1];

        /* HashMap을 이용한 방법 */
        HashMap<String, Integer> hm = new HashMap<>();
        for(String player : participant){
            hm.put(player, hm.getOrDefault(player, 0) + 1);
        }
        for(String player : completion){
            hm.put(player, hm.get(player) -1);
        }
        String key = "";
        for(Map.Entry<String, Integer> entry : hm.entrySet()){
            if(entry.getValue() != 0){
                key = entry.getKey();
                break;
            }
        }
        return key;
    }

    public static void main(String[] args){
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        Solution sol = new Solution();

        System.out.println(sol.solution(participant, completion));
    }
}
