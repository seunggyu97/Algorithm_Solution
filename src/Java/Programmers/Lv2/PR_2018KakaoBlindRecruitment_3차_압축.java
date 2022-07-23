package Java.Programmers.Lv2;

import java.util.*;

class Compress{
    public Integer[] compress(String msg){

        Map<String, Integer> hm = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int characterNum = 65;
        int idx = 0, count = 27;

        for(int i = 1; i<count; i++){
            hm.put(Character.toString(characterNum), i);
            characterNum = (char)(characterNum + 1);
        }

        while(true){
            if(idx > msg.length()-1) break;
            StringBuilder sb = new StringBuilder();
            sb.append(msg.charAt(idx));

            while(true){
                if(idx == msg.length()-1) {
                    list.add(hm.get(sb.toString()));
                    idx++;
                    break;
                }
                String s = Character.toString(msg.charAt(idx + 1));
                if(!hm.containsKey(sb+ s)) {
                    list.add(hm.get(sb.toString()));
                    sb.append(s);
                    idx++;
                    break;
                }
                sb.append(msg.charAt(idx+1));
                idx++;
            }
            hm.put(sb.toString(), count);
            count++;

        }
        return list.toArray(new Integer[list.size()]);
    }

    public static void main(String[] args){
        String msg = "KAKAO";
        Compress sol = new Compress();

        System.out.println(Arrays.toString(sol.compress(msg)));
    }
}