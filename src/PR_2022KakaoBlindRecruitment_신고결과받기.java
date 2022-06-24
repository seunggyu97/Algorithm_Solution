//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//
//class Solution{
//    public int[] solution(String[] id_list, String[] report, int k){
//        // 기본 베이스 구축
//        HashMap<String, ArrayList<String>> hm = new HashMap<>();
//        HashMap<String, Integer> resultMap = new HashMap<>();
//        for(String s : id_list){
//            hm.put(s, new ArrayList<>());
//            resultMap.put(s, 0);
//        }
//
//        Loop1 : for(String r : report){
//            String[] reportArr = r.split(" ");
//            ArrayList<String> tmpList = hm.get(reportArr[1]);
//            if(tmpList.isEmpty()){
//                tmpList.add(reportArr[0]);
//                hm.put(reportArr[1], tmpList);
//                continue;
//            }
//            for (String s : tmpList) {
//                if (reportArr[0].equals(s)) {
//                    continue Loop1;
//                }
//            }
//            tmpList.add(reportArr[0]);
//        }
//
//        // 신고 결과 처리
//        int[] result = new int[id_list.length];
//
//        for(Map.Entry<String, ArrayList<String>> entry : hm.entrySet()){
//            if(entry.getValue().size() >= k){
//                for(String s : entry.getValue()){
//                    resultMap.put(s,resultMap.getOrDefault(s,0)+1);
//                }
//            }
//        }
//        for(int i = 0; i< id_list.length; i++){
//            result[i] = resultMap.get(id_list[i]);
//        }
//        return result;
//    }
//
//    public static void main(String[] args){
//        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
//        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
//        int k = 2;
//
//        Solution sol = new Solution();
//        System.out.println(Arrays.toString(sol.solution(id_list, report, k)));
//    }
//}