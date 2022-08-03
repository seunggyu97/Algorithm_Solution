package Java.Programmers.Lv2;

import java.util.Arrays;

class MaxMinValues{
    public String maxMinValues(String s){
        int[] arr = Arrays.stream(s.split(" ")).mapToInt(Integer :: parseInt).toArray();
        Arrays.sort(arr);

        return arr[0] + " " + arr[arr.length-1];
    }

    public static void main(String[] args){
        String s = "1 2 3 4";
        MaxMinValues sol = new MaxMinValues();
        System.out.println(sol.maxMinValues(s));
    }

}
