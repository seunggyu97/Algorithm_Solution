package Java.Programmers.Lv1.StringArray;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for(int i = 0; i+p.length()-1 < t.length(); i++) {
            if(Long.parseLong(t.substring(i,i+p.length())) <= Long.parseLong(p)) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        String t = "12341512";
        String p = "3000";

        Solution sol = new Solution();

        System.out.println(sol.solution(t, p));
    }
}
