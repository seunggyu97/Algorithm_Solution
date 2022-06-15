import java.util.Arrays;

class Solution{
    public int solution(int[] d, int budget){
        int result = 0;
        Arrays.sort(d);
        for(int i : d){
            if(budget < i) break;
            budget -= i;
            result++;
        }
        return result;
    }
    public static void main(String[] args){
        int[] d = {1,3,2,5,3};
        int budget = 9;

        Solution sol = new Solution();
        System.out.println(sol.solution(d, budget));
    }
}