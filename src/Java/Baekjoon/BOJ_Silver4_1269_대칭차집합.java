package Java.Baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

class SymmetricDifferenceSet{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        String[] A = br.readLine().split(" ");
        String[] B = br.readLine().split(" ");
        HashSet<String> hs1 = new HashSet<>(Arrays.asList(A));
        HashSet<String> hs2 = new HashSet<>(Arrays.asList(B));

        for(String s : A){
            if(hs2.contains(s)) a--;
        }
        for(String s : B){
            if(hs1.contains(s)) b--;
        }

        System.out.println(a+b);
    }
}
