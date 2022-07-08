package Java.Programmers.Lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FunctionDevelopment {
    public int[] functionDevelopment(int[] progresses, int[] speeds) {
        int pt = 0;
        int day = 1;
        List<Integer> list = new ArrayList<>();
        while (pt < progresses.length) {
            int count = 0;

            if(progresses[pt] + (speeds[pt]*day) >= 100) {
                count++;
                pt++;
                for(int i = pt; i<progresses.length; i++){
                    if(progresses[i] + (speeds[i]*day) >= 100){
                        count++;
                        pt++;
                    }else break;
                }
                list.add(count);
            }

            day++;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        FunctionDevelopment sol = new FunctionDevelopment();
        System.out.println(Arrays.toString(sol.functionDevelopment(progresses, speeds)));
    }
}
