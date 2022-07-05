package Java;

class Solution{
    public int solution(String dartResult){
        int[] answer = new int[3];
        int pt = 0;
        int result = 0;
        for(int i = 0; i<dartResult.length(); i++){
            if(dartResult.charAt(i) >= '0' && dartResult.charAt(i) <= '9') {
                int plusCount = 0;
                answer[pt] = Character.getNumericValue(dartResult.charAt(i));
                if (dartResult.charAt(i + 1) == '0') {
                    answer[pt] = 10;
                    plusCount++;
                }
                switch (dartResult.charAt(i + plusCount+1)) {
                    case 'S':
                        plusCount++;
                        break;
                    case 'D':
                        plusCount++;
                        answer[pt] = (int)Math.pow(answer[pt], 2);
                        break;
                    case 'T':
                        plusCount++;
                        answer[pt] = (int)Math.pow(answer[pt], 3);
                        break;
                }
                if (i + plusCount + 1 < dartResult.length() && dartResult.charAt(i + plusCount + 1) == '*') {
                    plusCount++;
                    answer[pt] *= 2;
                    if (pt != 0) {
                        answer[pt - 1] *= 2;
                    }
                } else if (i + plusCount + 1 < dartResult.length() && dartResult.charAt(i + plusCount + 1) == '#') {
                    plusCount++;
                    answer[pt] *= -1;

                }
                i += plusCount;
                pt++;
            }
        }
        for(int i : answer){
            result += i;
        }
        return result;
    }

    public static void main(String[] args){
        String dartResult = "1D2S#10S";
        Solution sol = new Solution();

        System.out.println(sol.solution(dartResult));
    }
}