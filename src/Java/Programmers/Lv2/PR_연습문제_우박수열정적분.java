package Java.Programmers.Lv2.DefiniteIntegral;

import java.util.Arrays;

class Solution {
    public double[] solution(int k, int[][] ranges){
        double[] answer = new double[ranges.length];

        // 콜라츠 추측에 의해 k가 몇 번만에 1이 되는지 계산
        int num = count(k);
        double[] yVal = new double[num+1];

        yVal[0] = k;
        for(int i = 1; i<num+1; i++){
            double pre = yVal[i-1];
            yVal[i] = calYval(pre);
        }

        // 사다리꼴 넓이 배열 area[1] = 그래프 (0,1) 넓이
        double[] area = new double[num+1];
        for(int i = 1; i < num + 1; i++){
            area[i] = (yVal[i-1] + yVal[i]) / 2;
        }

        double[] sum = new double[num+1];
        sum[1] = area[1];
        for(int i = 2; i < num+1; i++){
            sum[i] = area[i] + sum[i-1];
        }

        for(int i = 0; i<ranges.length; i++){
            int a = ranges[i][0];
            int b = num + ranges[i][1];

            if(b > a){
                double val = sum[b] - sum[a];
                String str = String.format("%.1f", val);
                answer[i] = (Double.parseDouble(str));
            }else if(a > b){
                answer[i] = -1.0;
            }else{
                answer[i] = 0.0;
            }
        }
        return answer;
    }

    public double calYval(double k){
        if(k%2 == 0){
            return k/2;
        }else{
            return k*3+1;
        }
    }

    public int count(int k){
        int count = 0;
        while(k > 1){
            if(k % 2 == 0) {
                k /= 2;
                count++;
            }
            else{
                k *= 3;
                k += 1;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int k = 5;
        int[][] ranges = {{0,0},{0,-1},{2,-3},{3,-3}};

        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(k, ranges)));
    }
}
