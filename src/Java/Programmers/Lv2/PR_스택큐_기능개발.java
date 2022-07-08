package Java.Programmers.Lv2;

import java.util.*;
class FunctionDevelopment {
    public int[] functionDevelopment(int[] progresses, int[] speeds) {
        int day = 1;
        int job = 0;

        List<Integer> list = new ArrayList<>();
        while (true) {
            int gropCount = 0;
            if(progresses[job] + (speeds[job]*day) >= 100) {
                gropCount++;
                job++;
                for(int i = job; i < progresses.length; i++) {
                    if(progresses[i] + (speeds[i]*day) >= 100) {
                        job++;
                        gropCount++;
                    } else {
                        break;
                    }
                }
                list.add(gropCount);
                if(job >= progresses.length) {
                    break;
                }
            } else {
                day++;
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }


    public static void main(String[] args){
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        FunctionDevelopment sol = new FunctionDevelopment();
        System.out.println(Arrays.toString(sol.functionDevelopment(progresses, speeds)));
    }
}
