package Java.Programmers.Lv1;

import java.util.HashMap;

class Mbti {
    public String mbti(String[] survey, int[] choices){
        String answer = "";
        HashMap<Character, Integer> hm = new HashMap<>();
        Character[] mbtis = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        for(char c : mbtis){
            hm.put(c, 0);
        }
        for(int i = 0; i<survey.length; i++){
            int score = choices[i];
            if(score < 4){
                char c = survey[i].charAt(0);
                hm.put(c, hm.get(c) + 4 - score);
            }else if(score > 4){
                char c = survey[i].charAt(1);
                hm.put(c, hm.get(c) + score - 4);
            }
        }
        for(int i = 0; i < mbtis.length; i+=2){
            if(hm.get(mbtis[i]) >= hm.get(mbtis[i+1])){
                answer += Character.toString(mbtis[i]);
            }else{
                answer += Character.toString(mbtis[i+1]);
            }
        }

        return answer;
    }
    public static void main(String[] args){
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};

        Mbti sol = new Mbti();
        System.out.println(sol.mbti(survey, choices));
    }
}