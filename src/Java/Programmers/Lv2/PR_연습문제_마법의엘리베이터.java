package Java.Programmers.Lv2.Elevator;

class Solution {
    public int solution(int storey) {
        int answer = 0;
        char[] charr = Integer.toString(storey).toCharArray();
        int[] arr = new int[Integer.toString(storey).length()];
        for(int i = 0; i < charr.length; i++) {
            arr[i] = Character.getNumericValue(charr[i]);
        }

        for (int i = arr.length - 1; i > 0; i--) {

            if (arr[i] < 5) {
                answer += arr[i];
                arr[i] = 0;
            } else if (arr[i] > 5) {
                arr[i - 1] = arr[i - 1] + 1;
                answer += 10 - arr[i];
                arr[i] = 0;
            } else {
                if (arr[i - 1] >= 5) {
                    arr[i-1] = arr[i - 1] + 1;
                    answer += 10 - arr[i];
                    arr[i] = 0;
                } else {
                    answer += arr[i];
                    arr[i] = 0;
                }
            }
        }
        if(arr[0] > 5) {
            answer += 11 - arr[0];
        } else {
            answer += arr[0];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution(646));
    }
}
