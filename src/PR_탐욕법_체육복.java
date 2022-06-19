import java.util.Arrays;
import java.util.HashMap;

class Solution{
    public int solution(int n, int[] lost, int[] reverse){
        HashMap<Integer, Boolean> hm = new HashMap<>();
        int result = n;
        Arrays.sort(lost);
        Arrays.sort(reverse);

        for(int i = 1; i <= n; i++){
            hm.put(i, true);
        }
        for(int i:lost){
            hm.put(i, false);
            result--;
        }
        for(int i : reverse){
            if(!hm.get(i)){
                result++;
                hm.put(i, true);
                continue;
            }
            if(hm.get(i-1) != null && !hm.get(i-1)){
                result++;
                hm.put(i-1, true);
            }else if(hm.get(i+1) != null && !hm.get(i+1)){
                result++;
                hm.put(i+1, true);
            }
        }
        return result;
    }

    public static void main(String[] args){
        int n = 4;
        int[] lost = {1,2,3,4};
        int[] reverse = {2,3};

        Solution sol = new Solution();
        System.out.println(sol.solution(n, lost, reverse));
    }
}