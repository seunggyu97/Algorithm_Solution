// Failed -> 다시 풀어볼 것
package Java.Programmers.PCCP모의고사;

import java.util.Arrays;
import java.util.Comparator;

class OperatingSystem {
    public long[] operatingSystem(int[][] program){
        long[] answer = new long[11];
        int num = 0;

        // 호출된 시간 순으로 정렬
        Arrays.sort(program, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1], o2[1]); // o1[1] > o2[1] ? 1 : (o1[1] == o2[1] ? 0 : -1)
            }
        });

        while (num != program.length){
            boolean flag = false;
            int i = num;
            while(!flag){
                if(i+1 < program.length && program[i+1][1] <= answer[0] && program[i][0] > program[i+1][0]){
                    int[] tmp = program[i];
                    program[i] = program[i+1];
                    program[i+1] = tmp;
                    i++;
                }
                else flag = true;
            }
            answer[program[num][0]] += answer[0] - program[num][1];
            answer[0] += program[num][2];
            num++;
        }

        return answer;
    }

    public static void main(String[] args){
        int[][] program = {{2, 0, 10}, {1, 5, 5}, {3, 5, 3}, {3, 12, 2}};

        OperatingSystem sol = new OperatingSystem();

        System.out.println(Arrays.toString(sol.operatingSystem(program)));
    }
}
