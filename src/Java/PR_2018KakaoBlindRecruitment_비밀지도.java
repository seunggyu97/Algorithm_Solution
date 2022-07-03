package Java;

import java.util.Arrays;

class Solution{
    int maxLength = 0;
    StringBuilder sb;
    public String[] solution(int n, int[] arr1, int[] arr2){
        String[] answer = new String[n];

        for(int i = 0; i < n; i++){
            answer[i] = compare(arr1[i],arr2[i]);
        }

        for(int i = 0; i < n; i++){
            if(answer[i].length() < maxLength){
                int count = maxLength - answer[i].length();
                String tmp = "";
                for(int j = 0; j < count; j++){
                    tmp += " ";
                }
                answer[i] = tmp + answer[i];
            }
        }
        return answer;
    }

    public String compare(int num1, int num2){
        sb = new StringBuilder();
        String convert1 = Integer.toBinaryString(num1);
        String convert2 = Integer.toBinaryString(num2);
        int tmpLength = convert1.length();
        if(convert1.length() < convert2.length()){
            String tmp = "";
            tmpLength = convert2.length();
            int count = convert2.length() - convert1.length();
            for(int i = 0; i<count; i++){
                tmp += "0";
            }
            convert1 = tmp + convert1;
        }
        else if (convert2.length() < convert1.length()){
            String tmp = "";
            int count = convert1.length() - convert2.length();
            for(int i = 0; i<count; i++){
                tmp += "0";
            }
            convert2 = tmp + convert2;
        }
        for(int i = 0; i<convert1.length(); i++){
            if (Character.getNumericValue(convert1.charAt(i)) + Character.getNumericValue(convert2.charAt(i)) == 0) {
                sb.append(" ");
            } else {
                sb.append("#");
            }
        }
        if(maxLength < tmpLength) maxLength = tmpLength;

        return sb.toString();
    }
    public static void main(String[] args){
        int n = 5;
        int[] arr1 = {46,33,33,22,31,50};
        int[] arr2 = {27,56,19,14,14,10};

        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(n, arr1, arr2)));
    }
}