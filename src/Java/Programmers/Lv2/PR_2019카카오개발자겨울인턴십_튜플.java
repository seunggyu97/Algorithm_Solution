package Java.Programmers.Lv2;

import java.util.*;

class Tuple{
    public int[] tuple(String s){
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> hm = new HashMap<>();
        boolean flag = false;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9'){
                sb.append(ch);
                flag = true;
            }else{
                if(flag){
                    int value = Integer.parseInt(sb.toString());
                    hm.put(value, hm.getOrDefault(value, 0) + 1);
                    sb = new StringBuilder();
                    flag = false;
                }
            }
        }

        int[] result = new int[hm.size()];
        int p = 0;
        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(hm.entrySet());
        entryList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        for(Map.Entry<Integer, Integer> entry : entryList){
            result[p] = entry.getKey();
            p++;
        }

        return result;
    }

    public static void main(String[] args){
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";

        Tuple sol = new Tuple();
        System.out.println(Arrays.toString(sol.tuple(s)));
    }
}