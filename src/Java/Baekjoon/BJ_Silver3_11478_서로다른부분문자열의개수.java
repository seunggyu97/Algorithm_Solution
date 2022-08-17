package Java.Baekjoon;

import java.io.*;
import java.util.HashSet;
class StringArrCount{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        HashSet<String> hs = new HashSet<>();
        int length = s.length();
        for(int i = 0; i<length; i++){
            for(int j = i+1; j<=length; j++){
                String tmp = s.substring(i,j);
                hs.add(tmp);
            }
        }
        System.out.println(hs.size());
    }
}
