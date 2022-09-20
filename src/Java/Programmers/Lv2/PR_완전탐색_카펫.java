package Java.Programmers.Lv2;

import java.util.Arrays;

class Carpet {
    public int[] carpet(int brown, int yellow){
        int[] answer = new int[2];
        int sum = brown + yellow;

        for(int i = 3; i<= sum; i++){
            int row = i; // 세로
            int col = sum / i; // 가로

            if(row>col) continue;

            if((row - 2) * (col - 2) == yellow){
                answer[0] = col;
                answer[1] = row;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        int brown = 10;
        int yellow = 2;

        Carpet sol = new Carpet();
        System.out.println(Arrays.toString(sol.carpet(brown, yellow)));
    }
}
