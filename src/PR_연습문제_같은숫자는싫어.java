import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution{
    public int[] solution(int[] arr){
        Queue<Integer> queue = new LinkedList<>();
        int[] answer;
        int tmp=-1;
        for(int i : arr){
            if(i==tmp) continue;
            queue.add(i);
            tmp = i;
        }
        answer = new int[queue.size()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = queue.poll();
        }
        return answer;
    }

    public static void main(String[] args){
        int[] arr = {1,1,3,3,0,1,1};
        Solution sol = new Solution();

        System.out.println(Arrays.toString(sol.solution(arr)));
    }
}

