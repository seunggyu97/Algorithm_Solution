package Java.Programmers.Lv2;

import java.util.HashMap;
import java.util.Map;

class Camouflage{
    public int camouflage(String[][] clothes){
        Map<String, Integer> hm = new HashMap<>();
        int answer = 1;

        for (String[] str : clothes) {
            if (hm.containsKey(str[1])) {
                hm.put(str[1], hm.get(str[1]) + 1);
            } else {
                hm.put(str[1], 2); // 입는 경우와 안입는 경우를 포함하기 때문에 value는 2로 시작
            }
        }

        for(Map.Entry<String, Integer> entry : hm.entrySet()){
            answer *= entry.getValue();
        }

        return answer-1;
    }

    public static void main(String[] args){
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        Camouflage sol = new Camouflage();

        System.out.println(sol.camouflage(clothes));
    }
}