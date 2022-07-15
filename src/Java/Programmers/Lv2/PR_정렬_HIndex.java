package Java.Programmers.Lv2;

import java.util.*;

class H_index{
    public int h_index(int[] citations){
        int answer = 0;
        Arrays.sort(citations);

        for(int i = 0; i < citations.length; i++){
            if(citations[i] >= citations.length-i){
                answer = citations.length-i;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        int[] citations = {100, 100, 100};
        H_index sol = new H_index();

        System.out.println(sol.h_index(citations));
    }
}
