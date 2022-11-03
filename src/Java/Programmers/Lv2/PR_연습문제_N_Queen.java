package Java.Programmers.Lv2;

class N_Queen{
    static int answer = 0;
    static int[] arr;
    static int N;

    public static void n_Queen(int depth){

        // 재귀 탈출 조건
        if(depth == N) {
            // depth 는 퀸이 놓인 개수
            // 퀸이 N개 놓인 상태면 답을 증가 시키고 빠져나간다.
            answer++;
            return;
        }


        for(int i = 0; i < N; i++){
            arr[depth] = i;
            // arr[0] 은 첫번째 열을 뜻함, 0 1 2 3 은 행 순서

            // 백트래킹 적용
            // 퀸을 놓을 수 있는 자리인지 판별
            if(isPossible(depth)){
                n_Queen(depth+1);
            }
        }
    }

    public static boolean isPossible(int depth){
        for(int i = 0; i < depth; i++){
            // depth가 0이라면 for 문 실행 안됨 -> true 반환

            // 가로라인에 퀸이 존재할 경우(이전 열 들과 같은 행일 경우)
            if(arr[i] == arr[depth]){
                return false;
            }

            // 대각선에 퀸이 존재할 경우
            // 대각선에 퀸이 존재하는 경우를 판별하는 방법은 각각의 열의 차이와 행의 차이가 같으면 대각선에 위치해있는 것.
            if(Math.abs(depth - i) == Math.abs(arr[depth] - arr[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        N = 4;
        arr = new int[N];
        n_Queen(0);

        System.out.println(answer);
    }
}
