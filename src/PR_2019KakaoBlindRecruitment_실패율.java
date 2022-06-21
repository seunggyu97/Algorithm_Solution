import java.util.Arrays;

class Solution{
    public float[] solution(int N, int[] stages){
        // N : 스테이지 수
        // stages : 현재 머물러있는 스테이지 배열
        // (N+1은 마지막 스테이지를 클리어 한 사용자)
        // 실패율 : 스테이지에 도달했지만 아직 클리어하지 못한 플레이어 수 / 스테이지에 도달한 플레이어 수
        // 실패율이 같다면 작은 번호의 스테이지가 먼저 옴
        // 스테이지에 도달한 플레이어가 없는 경우 해당 스테이지의 실패율은 0
        // 반환 : 실패율이 높은 순서부터 내림차순으로 담은 배열

        Arrays.sort(stages);
        int[] currentPlayer = new int[N+1];

        int clearPlayer = 0;
        int previous = stages[0];
        float[] failure = new float[N+1];
        for(int i : stages){
            currentPlayer[i-1]++;
        }

        for(int i = 0; i<currentPlayer.length; i++){
            if(currentPlayer[i] == 0){
                failure[i] = 0;
                continue;
            }
            failure[i] = currentPlayer[i]/(stages.length-previous);
            System.out.println(failure[i]);
            previous += currentPlayer[i];
            System.out.println(previous);
        }

        return failure;
    }

    public static void main(String[] args){
        int N = 5;
        int[] stages = {2,1,2,6,2,4,3,3};
        Solution sol = new Solution();

        System.out.println(Arrays.toString(sol.solution(N, stages)));
    }
}