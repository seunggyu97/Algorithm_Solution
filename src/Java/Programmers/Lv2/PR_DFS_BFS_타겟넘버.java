package Java.Programmers.Lv2;

class TargetNumber{
    int[] numbers;
    int target;
    int answer;
    void dfs(int index, int sum){
        if(index == numbers.length){
            if(sum == target) answer++;
            return;
        }

        dfs(index+1, sum + numbers[index]);
        dfs(index+1, sum - numbers[index]);
    }
    public int targetNumber(int[] numbers, int target){
        answer = 0;
        this.numbers = numbers;
        this.target = target;

        dfs(0,0);

        return answer;
    }

    public static void main(String[] args){
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;

        TargetNumber sol = new TargetNumber();
        System.out.println(sol.targetNumber(numbers, target));
    }
}