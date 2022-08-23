package Java.Baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;

class NumberCard{
    StringBuilder sb = new StringBuilder();
    public String numberCard(int N,String[] numArr, int M, String[] numArr2){
        HashSet<String> hs = new HashSet<>(Arrays.asList(numArr));

        for(int i = 0; i<M; i++){
            if(i != 0) sb.append(" ");
            if(hs.contains(numArr2[i])) sb.append("1");
            else sb.append("0");
        }

        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[] numArr = br.readLine().split(" ");
        int M = Integer.parseInt(br.readLine());
        String[] numArr2 = br.readLine().split(" ");

        NumberCard sol = new NumberCard();
        System.out.println(sol.numberCard(N, numArr, M, numArr2));
    }
}
