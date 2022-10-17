package Java.Programmers.PCCP모의고사;

class AthleticCompetition{
    int answer;
    int[] visited;
    int sum = 0;
    public void dfs(int[][] arr, int depth){
        if(depth == arr[0].length){
            if(sum > answer) {
                answer = sum;
            }
            return;
        }
        for(int i = 0; i<arr.length; i++){
            if(visited[i] == 1){
                continue;
            }
            visited[i] = 1;
            sum += arr[i][depth];
            dfs(arr, depth+1);
            sum -= arr[i][depth];
            visited[i] = 0;
        }
    }
    public int athleticCompetition(int[][] ability){
        answer = 0;
        visited = new int[ability.length];

        dfs(ability, 0);

        return answer;
    }

    public static void main(String[] args){
        int[][] ability = {{40, 10, 10}, {20, 5, 0}, {30, 30, 30}, {70, 0, 70}, {100, 100, 100}};

        AthleticCompetition sol = new AthleticCompetition();
        System.out.println(sol.athleticCompetition(ability));
    }
}