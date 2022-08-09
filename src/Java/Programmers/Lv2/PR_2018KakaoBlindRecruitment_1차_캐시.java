package Java.Programmers.Lv2;

import java.util.Deque;
import java.util.LinkedList;

class Cache {
    static final int CACHE_HIT = 1;
    static final int CACHE_MISS = 5;
    public int cache(int cacheSize, String[] cities){
        if(cacheSize == 0) return 5 * cities.length;

        Deque<String> dq = new LinkedList<>();
        int answer = 0;
        for(String s : cities){
            String str = s.toUpperCase();

            if(dq.remove(str)){
                dq.addFirst(str);
                answer += CACHE_HIT;
            }
            else{
                if(dq.size() == cacheSize){
                    dq.pollLast();
                }
                dq.addFirst(str);
                answer += CACHE_MISS;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

        Cache sol = new Cache();
        System.out.println(sol.cache(cacheSize, cities));
    }
}
