import java.util.Arrays;

class Solution{
    public String solution(String s, int n){
        char[] chr = s.toCharArray();
        String answer = "";
        for(char i = 0; i< chr.length; i++){
            if(chr[i] == ' '){
                answer += " ";
                continue;
            }
            int chrnum = (int)chr[i];
            if(chrnum >= 65 && chrnum <= 90){
                answer += Character.toString(check(chrnum+n, 65, 90));
            }
            else{
                answer += Character.toString((char)check(chrnum+n,97, 122));
            }
        }
        return answer;
    }

    public int check(int i, int first, int last){
        if(i < first || i > last){
            i = first + i-last-1;
            i = check(i, first, last);
        }

        return i;
    }

    public static void main(String[] args){
        String s = "Zz";
        int n = 26;
        Solution sol = new Solution();

        System.out.println(sol.solution(s, n).toString());
    }
}
